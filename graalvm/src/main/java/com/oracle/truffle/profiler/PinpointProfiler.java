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

import com.navercorp.pinpoint.grpc.client.ChannelFactory;
import com.navercorp.pinpoint.grpc.client.ChannelFactoryBuilder;
import com.navercorp.pinpoint.grpc.client.DefaultChannelFactoryBuilder;
import com.navercorp.pinpoint.grpc.trace.PSpan;
import com.navercorp.pinpoint.grpc.trace.PTransactionId;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.Option;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.instrumentation.EventContext;
import com.oracle.truffle.api.instrumentation.ExecutionEventListener;
import com.oracle.truffle.api.instrumentation.SourceSectionFilter;
import com.oracle.truffle.api.instrumentation.StandardTags;
import com.oracle.truffle.api.instrumentation.TruffleInstrument;
import com.oracle.truffle.api.instrumentation.TruffleInstrument.Registration;
import com.oracle.truffle.api.interop.ArityException;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.interop.UnsupportedTypeException;
import com.oracle.truffle.grpc.SpanGrpcDataSender;
import org.graalvm.options.OptionCategory;
import org.graalvm.options.OptionDescriptors;
import org.graalvm.options.OptionKey;
import org.graalvm.options.OptionStability;

@Registration(id = PinpointProfiler.ID, services = PinpointProfiler.class)
public class PinpointProfiler extends TruffleInstrument {

//    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Option(name = "", help = "Enable Pinpoint Agent Profiler Instrumentation (default: false).", category = OptionCategory.USER, stability = OptionStability.STABLE)
    static final OptionKey<Boolean> PINPOINT_PROFILER_ENABLED = new OptionKey<>(false);

    public static final String ID = "pinpoint-profiler";

    final static ChannelFactoryBuilder channelFactoryBuilder = new DefaultChannelFactoryBuilder("SpanGrpcDataSender");
    final static ChannelFactory channelFactory = channelFactoryBuilder.build();

    public static SpanGrpcDataSender spanGrpcDataSender = new SpanGrpcDataSender(
            "dev.collector.pinpoint.navercorp.com"
            , 9996
            , 3
            , channelFactory);

    @Override
    protected OptionDescriptors getOptionDescriptors() {
        System.out.println("@@@@@@@@@@getOptionDescriptors");
        return new PinpointProfilerOptionDescriptors();
    }


    private PSpan buildPspan() {

        final PTransactionId.Builder builder = PTransactionId.newBuilder();
        builder.setAgentId("roy-app");
        builder.setAgentStartTime(System.currentTimeMillis() - 3000);
        builder.setSequence(System.currentTimeMillis() - 2000);


        final PSpan.Builder pSpan = PSpan.newBuilder();
        pSpan.setVersion((byte) 1);
        pSpan.setApplicationServiceType(5);
        pSpan.setTransactionId(builder.build());

        pSpan.setStartTime(System.currentTimeMillis() - 1000);
        pSpan.setElapsed(1000);
        pSpan.setServiceType(5);

        pSpan.setApiId(55);

        return pSpan.build();
    }

    ExecutionEventListener myListener = new ExecutionEventListener() {

        int cnt = 0;

        @Override
        public void onEnter(EventContext eventContext, VirtualFrame frame) {
            System.out.println("onEnter myListener1");

            Object argument = frame.getArguments()[2];

            System.out.println(argument);

            InteropLibrary lib = InteropLibrary.getFactory().getUncached();
            try {
                lib.invokeMember(argument, "setHeader", "Pinpoint2", "instrumented Pinpoint Header");
            } catch (UnsupportedMessageException ex) {
//                logger.debug("[exception] {} ", ex);
            } catch (ArityException ex) {
//                logger.debug("[exception] {} ", ex);
            } catch (UnknownIdentifierException ex) {
//                logger.debug("[exception] {} ", ex);
            } catch (UnsupportedTypeException ex) {
//                logger.debug("[exception] {} ", ex);
            }

            PSpan pSpan = buildPspan();

            spanGrpcDataSender.send(pSpan);

        }

        @Override
        public void onReturnValue(EventContext eventContext, VirtualFrame frame, Object result) {

            cnt++;

//            System.out.println(context.getInstrumentedSourceSection());
            CompilerDirectives.transferToInterpreter();
            // notify the runtime that we will change the current execution flow
            System.out.println("cnt : " + cnt);
            throw eventContext.createUnwind(null);
        }

        @Override
        public void onReturnExceptional(EventContext eventContext, VirtualFrame frame, Throwable exception) {
            System.out.println("onReturnExceptional myListener1");

        }

        @Override
        public Object onUnwind(EventContext eventContext, VirtualFrame frame, Object info) {
            // just return 42 as the return value for this node
            return "instrumented by 1 ";
        }
    };

    @Override
    protected void onCreate(Env env) {

        env.registerService(this);

//        SourceFilter sourceFilter = SourceFilter.newBuilder().languageIs("js").build();

        SourceSectionFilter sourceSectionFilter = SourceSectionFilter.newBuilder()
                .tagIs(StandardTags.RootBodyTag.class)
                .rootNameIs(s -> s != null && s.equals("func2"))
                .includeInternal(false)
                .build();

        env.getInstrumenter().attachExecutionEventListener(sourceSectionFilter, myListener);
    }
}