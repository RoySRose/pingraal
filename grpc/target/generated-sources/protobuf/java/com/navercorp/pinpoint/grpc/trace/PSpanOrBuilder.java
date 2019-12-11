// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Span.proto

package com.navercorp.pinpoint.grpc.trace;

public interface PSpanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v1.PSpan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 version = 1;</code>
   */
  int getVersion();

  /**
   * <code>.v1.PTransactionId transactionId = 2;</code>
   */
  boolean hasTransactionId();
  /**
   * <code>.v1.PTransactionId transactionId = 2;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PTransactionId getTransactionId();
  /**
   * <code>.v1.PTransactionId transactionId = 2;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PTransactionIdOrBuilder getTransactionIdOrBuilder();

  /**
   * <code>sfixed64 spanId = 3;</code>
   */
  long getSpanId();

  /**
   * <code>sfixed64 parentSpanId = 4;</code>
   */
  long getParentSpanId();

  /**
   * <pre>
   * span event's startTimestamp
   * </pre>
   *
   * <code>int64 startTime = 5;</code>
   */
  long getStartTime();

  /**
   * <code>int32 elapsed = 6;</code>
   */
  int getElapsed();

  /**
   * <code>int32 apiId = 7;</code>
   */
  int getApiId();

  /**
   * <code>int32 serviceType = 8;</code>
   */
  int getServiceType();

  /**
   * <code>.v1.PAcceptEvent acceptEvent = 9;</code>
   */
  boolean hasAcceptEvent();
  /**
   * <code>.v1.PAcceptEvent acceptEvent = 9;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PAcceptEvent getAcceptEvent();
  /**
   * <code>.v1.PAcceptEvent acceptEvent = 9;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PAcceptEventOrBuilder getAcceptEventOrBuilder();

  /**
   * <code>repeated .PAnnotation annotation = 10;</code>
   */
  java.util.List<com.navercorp.pinpoint.grpc.trace.PAnnotation> 
      getAnnotationList();
  /**
   * <code>repeated .PAnnotation annotation = 10;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PAnnotation getAnnotation(int index);
  /**
   * <code>repeated .PAnnotation annotation = 10;</code>
   */
  int getAnnotationCount();
  /**
   * <code>repeated .PAnnotation annotation = 10;</code>
   */
  java.util.List<? extends com.navercorp.pinpoint.grpc.trace.PAnnotationOrBuilder> 
      getAnnotationOrBuilderList();
  /**
   * <code>repeated .PAnnotation annotation = 10;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PAnnotationOrBuilder getAnnotationOrBuilder(
      int index);

  /**
   * <code>int32 flag = 11;</code>
   */
  int getFlag();

  /**
   * <code>sint32 err = 12;</code>
   */
  int getErr();

  /**
   * <code>repeated .v1.PSpanEvent spanEvent = 13;</code>
   */
  java.util.List<com.navercorp.pinpoint.grpc.trace.PSpanEvent> 
      getSpanEventList();
  /**
   * <code>repeated .v1.PSpanEvent spanEvent = 13;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PSpanEvent getSpanEvent(int index);
  /**
   * <code>repeated .v1.PSpanEvent spanEvent = 13;</code>
   */
  int getSpanEventCount();
  /**
   * <code>repeated .v1.PSpanEvent spanEvent = 13;</code>
   */
  java.util.List<? extends com.navercorp.pinpoint.grpc.trace.PSpanEventOrBuilder> 
      getSpanEventOrBuilderList();
  /**
   * <code>repeated .v1.PSpanEvent spanEvent = 13;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PSpanEventOrBuilder getSpanEventOrBuilder(
      int index);

  /**
   * <code>.PIntStringValue exceptionInfo = 14;</code>
   */
  boolean hasExceptionInfo();
  /**
   * <code>.PIntStringValue exceptionInfo = 14;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PIntStringValue getExceptionInfo();
  /**
   * <code>.PIntStringValue exceptionInfo = 14;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PIntStringValueOrBuilder getExceptionInfoOrBuilder();

  /**
   * <code>int32 applicationServiceType = 15;</code>
   */
  int getApplicationServiceType();

  /**
   * <code>int32 loggingTransactionInfo = 16;</code>
   */
  int getLoggingTransactionInfo();
}