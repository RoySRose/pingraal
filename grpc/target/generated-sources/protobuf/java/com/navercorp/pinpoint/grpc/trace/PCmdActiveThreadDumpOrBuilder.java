// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cmd.proto

package com.navercorp.pinpoint.grpc.trace;

public interface PCmdActiveThreadDumpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v1.PCmdActiveThreadDump)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 limit = 1;</code>
   */
  int getLimit();

  /**
   * <code>repeated string threadName = 2;</code>
   */
  java.util.List<java.lang.String>
      getThreadNameList();
  /**
   * <code>repeated string threadName = 2;</code>
   */
  int getThreadNameCount();
  /**
   * <code>repeated string threadName = 2;</code>
   */
  java.lang.String getThreadName(int index);
  /**
   * <code>repeated string threadName = 2;</code>
   */
  com.google.protobuf.ByteString
      getThreadNameBytes(int index);

  /**
   * <code>repeated int64 localTraceId = 3;</code>
   */
  java.util.List<java.lang.Long> getLocalTraceIdList();
  /**
   * <code>repeated int64 localTraceId = 3;</code>
   */
  int getLocalTraceIdCount();
  /**
   * <code>repeated int64 localTraceId = 3;</code>
   */
  long getLocalTraceId(int index);
}