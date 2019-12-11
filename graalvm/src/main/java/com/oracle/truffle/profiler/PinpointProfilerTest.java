/*
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oracle.truffle.profiler;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.Option;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.instrumentation.EventContext;
import com.oracle.truffle.api.instrumentation.ExecutionEventListener;
import com.oracle.truffle.api.instrumentation.ExecutionEventNode;
import com.oracle.truffle.api.instrumentation.ExecutionEventNodeFactory;
import com.oracle.truffle.api.instrumentation.SourceFilter;
import com.oracle.truffle.api.instrumentation.SourceSectionFilter;
import com.oracle.truffle.api.instrumentation.StandardTags;
import com.oracle.truffle.api.instrumentation.TruffleInstrument;
import com.oracle.truffle.api.instrumentation.TruffleInstrument.Registration;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.source.SourceSection;
import org.graalvm.options.OptionCategory;
import org.graalvm.options.OptionDescriptors;
import org.graalvm.options.OptionKey;
import org.graalvm.options.OptionStability;
import org.graalvm.options.OptionValues;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Instrument;
import org.graalvm.polyglot.io.ByteSequence;

@Registration(id = PinpointProfilerTest.ID, services = PinpointProfilerTest.class)
public class PinpointProfilerTest extends TruffleInstrument {

    @Option(name = "", help = "Enable Pinpoint Agent Profiler Instrumentation (default: false).", category = OptionCategory.USER, stability = OptionStability.STABLE)
    static final OptionKey<Boolean> PINPOINT_PROFILER_ENABLED = new OptionKey<>(false);


    public static final String ID = "pinpoint-profiler-test";

//    private final Map<SourceSection, Counter> counters = Collections.synchronizedMap(new HashMap<SourceSection, Counter>());

    @Override
    protected OptionDescriptors getOptionDescriptors() {
        System.out.println("@@@@@@@@@@getOptionDescriptors");
        return new PinpointProfilerTestOptionDescriptors();
    }

    ExecutionEventListener myListener = new ExecutionEventListener() {

        int cnt =0;
        @Override
        public void onEnter(EventContext context, VirtualFrame frame) {
            System.out.println("onEnter myListener1");
        }

        @Override
        public void onReturnValue(EventContext context, VirtualFrame frame, Object result) {

            cnt++;

            System.out.println(context.getInstrumentedSourceSection().getSource().getPath());
            CompilerDirectives.transferToInterpreter();
            // notify the runtime that we will change the current execution flow
            System.out.println("cnt : " + cnt);
            throw context.createUnwind(null);
        }

        @Override
        public void onReturnExceptional(EventContext context, VirtualFrame frame, Throwable exception) {
            System.out.println("onReturnExceptional myListener1");

        }

        @Override
        public Object onUnwind(EventContext context, VirtualFrame frame, Object info) {
            // just return 42 as the return value for this node
            return "instrumented by 1 ";
        }
    };


    ExecutionEventListener myListener2 = new ExecutionEventListener() {

        int cnt =0;
        @Override
        public void onEnter(EventContext context, VirtualFrame frame) {
            System.out.println("onEnter myListener2");
        }

        @Override
        public void onReturnValue(EventContext context, VirtualFrame frame, Object result) {

            cnt++;

            System.out.println(context.getInstrumentedSourceSection().getSource());
            CompilerDirectives.transferToInterpreter();
            // notify the runtime that we will change the current execution flow
            System.out.println("this is it!@@@@");
            System.out.println("cnt : " + cnt);
            throw context.createUnwind(null);
        }

        @Override
        public void onReturnExceptional(EventContext context, VirtualFrame frame, Throwable exception) {
            System.out.println("onReturnExceptional myListener2");

        }

        @Override
        public Object onUnwind(EventContext context, VirtualFrame frame, Object info) {
            // just return 42 as the return value for this node
            return "instrumented by 2";
        }
    };

    @Override
    protected void onCreate(Env env) {

        env.registerService(this);

//        Predicate<String> fucn1Name = s -> s.equals("func2");

//        Reader stream = new InputStreamReader(
//                relativeClass.getResourceAsStream("sample.js")
//        );
//
//        Source source = null;
//
//        try {
//            source = Source.newBuilder("js", stream, "sample.js").
//                    .build();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        SourceFilter sourceFilter = SourceFilter.newBuilder().languageIs("js").build();
        SourceSectionFilter.Builder builder = SourceSectionFilter.newBuilder();

        builder.sourceIs(new SourceSectionFilter.SourcePredicate() {
            @Override
            public boolean test(Source source) {
                boolean file = source.getPath().equals("/Users/user/IdeaProjects/pingraal/helloworld.js");
                final boolean languageId = source.getLanguage().equals("js");
                return languageId && file;
            }
        });

        SourceSectionFilter sourceSectionFilter = SourceSectionFilter.newBuilder()
                .tagIs(StandardTags.RootTag.class)
                .rootNameIs(s -> s != null && s.equals("func1"))
                .includeInternal(false)
                .sourceIs(source -> {
                    boolean file = source.getPath().equals("/Users/user/IdeaProjects/pingraal/helloworld.js");
                    final boolean languageId = source.getLanguage().equals("js");
                    return languageId && file;
                })
                .build();


//
        SourceSectionFilter sourceSectionFilter2 = SourceSectionFilter.newBuilder()
        .tagIs(StandardTags.RootTag.class)
        .rootNameIs(s -> s != null && s.equals("func1"))
        .includeInternal(false)
        .sourceIs(source -> {
            boolean file = source.getPath().equals("/Users/user/IdeaProjects/pingraal/func.js");
            final boolean languageId = source.getLanguage().equals("js");
            return languageId && file;
        })
        .build();

//        System.out.println("sourceSectionFilter : " + sourceSectionFilter);
//        System.out.println(env.getInstrumenter().getClass());

        env.getInstrumenter().attachExecutionEventListener(sourceSectionFilter, myListener);

        env.getInstrumenter().attachExecutionEventListener(sourceSectionFilter2, myListener2);


//        for (Class<? extends ProfilerFrontEnd> frontEnd : installedFrontEnds) {
//            try {
//                System.out.println("@@@@@@@@@@@ " + frontEnd.getDeclaredConstructor());
//                frontEnd.getDeclaredConstructor().newInstance().onAttach(this);
//            } catch (Exception e) {
//                  throw new RuntimeException(e);
//            }
//        }

        // What source sections are we interested in?
//        SourceSectionFilter sourceSectionFilter = SourceSectionFilter.newBuilder().tagIs(JSTags.BinaryOperation.class).build();
//
//// What generates input data to track?
//        SourceSectionFilter inputGeneratingLocations = SourceSectionFilter.newBuilder().tagIs(
//                StandardTags.ExpressionTag.class).build();
//
//        env.getInstrumenter().attachExecutionEventFactory(sourceSectionFilter, inputGeneratingLocations, factory);


//        SourceSectionFilter.Builder builder = SourceSectionFilter.newBuilder();
//
//        env.getInstrumenter().attachExecutionEventFactory(builder.tagIs(StandardTags.StatementTag.class).build(), new ExecutionEventNodeFactory() {
//            public ExecutionEventNode create(final EventContext context) {
////                System.out.println("create : " + context.toString());
//                return new ExecutionEventNode() {
////                    private final Counter counter = createCounter(context.getInstrumentedSourceSection());
//
//                    @Override
//                    public void onEnter(VirtualFrame vFrame) {
////                        System.out.println("onEnter: " + vFrame.toString());
////                        counter.increment();
//                    }
//
//                    @Override
//                    public void onReturnValue(VirtualFrame vFrame, Object result) {
////                        System.out.println("onReturnValue: " + vFrame.toString() + ", " + result);
//                        String callSrc = context.getInstrumentedSourceSection().toString();
//                        // is this the function call that we want to modify?
//                        if ("func1()".equals(callSrc)) {
//                            CompilerDirectives.transferToInterpreter();
//                            // notify the runtime that we will change the current execution flow
//                            System.out.println("this is it!@@@@");
//                            throw context.createUnwind(null);
//                        }
//
////                        System.out.println("onReturnValue: " + vFrame.toString() + ", " + result);
////                        counter.increment();
//                    }
//                };
//            }
//        });
    }

//    private Counter createCounter(SourceSection section) {
//        CompilerAsserts.neverPartOfCompilation();
//        // For a production profiler you might want to differentiate between sources.
//        Counter counter = counters.get(section);
//        if (counter == null) {
//            counter = new Counter();
//            counters.put(section, counter);
//        }
//        return counter;
//    }

//    public Map<SourceSection, Counter> getCounters() {
//        return counters;
//    }

//    public static final class Counter {
//
//        private int count;
//
//        private Counter() {
//        }
//
//        public int getCount() {
//            return count;
//        }
//
//        void increment() {
//            count++;
//        }
//    }

    // in a production debugger this should be implemented using a proper service provider interface

}