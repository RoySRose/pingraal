// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Stat.proto

package com.navercorp.pinpoint.grpc.trace;

public interface PDirectBufferOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v1.PDirectBuffer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 directCount = 1;</code>
   */
  long getDirectCount();

  /**
   * <code>int64 directMemoryUsed = 2;</code>
   */
  long getDirectMemoryUsed();

  /**
   * <code>int64 mappedCount = 3;</code>
   */
  long getMappedCount();

  /**
   * <code>int64 mappedMemoryUsed = 4;</code>
   */
  long getMappedMemoryUsed();
}
