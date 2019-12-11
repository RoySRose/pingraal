// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Stat.proto

package com.navercorp.pinpoint.grpc.trace;

public interface PJvmGcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v1.PJvmGc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.v1.PJvmGcType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.v1.PJvmGcType type = 1;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PJvmGcType getType();

  /**
   * <code>int64 jvmMemoryHeapUsed = 2;</code>
   */
  long getJvmMemoryHeapUsed();

  /**
   * <code>int64 jvmMemoryHeapMax = 3;</code>
   */
  long getJvmMemoryHeapMax();

  /**
   * <code>int64 jvmMemoryNonHeapUsed = 4;</code>
   */
  long getJvmMemoryNonHeapUsed();

  /**
   * <code>int64 jvmMemoryNonHeapMax = 5;</code>
   */
  long getJvmMemoryNonHeapMax();

  /**
   * <code>int64 jvmGcOldCount = 6;</code>
   */
  long getJvmGcOldCount();

  /**
   * <code>int64 jvmGcOldTime = 7;</code>
   */
  long getJvmGcOldTime();

  /**
   * <code>.v1.PJvmGcDetailed jvmGcDetailed = 8;</code>
   */
  boolean hasJvmGcDetailed();
  /**
   * <code>.v1.PJvmGcDetailed jvmGcDetailed = 8;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PJvmGcDetailed getJvmGcDetailed();
  /**
   * <code>.v1.PJvmGcDetailed jvmGcDetailed = 8;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PJvmGcDetailedOrBuilder getJvmGcDetailedOrBuilder();
}