// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cmd.proto

package com.navercorp.pinpoint.grpc.trace;

public interface PCmdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v1.PCmdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 requestId = 1;</code>
   */
  int getRequestId();

  /**
   * <code>.v1.PCmdEcho commandEcho = 710;</code>
   */
  boolean hasCommandEcho();
  /**
   * <code>.v1.PCmdEcho commandEcho = 710;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PCmdEcho getCommandEcho();
  /**
   * <code>.v1.PCmdEcho commandEcho = 710;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PCmdEchoOrBuilder getCommandEchoOrBuilder();

  /**
   * <code>.v1.PCmdActiveThreadCount commandActiveThreadCount = 730;</code>
   */
  boolean hasCommandActiveThreadCount();
  /**
   * <code>.v1.PCmdActiveThreadCount commandActiveThreadCount = 730;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCount getCommandActiveThreadCount();
  /**
   * <code>.v1.PCmdActiveThreadCount commandActiveThreadCount = 730;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountOrBuilder getCommandActiveThreadCountOrBuilder();

  /**
   * <code>.v1.PCmdActiveThreadDump commandActiveThreadDump = 740;</code>
   */
  boolean hasCommandActiveThreadDump();
  /**
   * <code>.v1.PCmdActiveThreadDump commandActiveThreadDump = 740;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDump getCommandActiveThreadDump();
  /**
   * <code>.v1.PCmdActiveThreadDump commandActiveThreadDump = 740;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpOrBuilder getCommandActiveThreadDumpOrBuilder();

  /**
   * <code>.v1.PCmdActiveThreadLightDump commandActiveThreadLightDump = 750;</code>
   */
  boolean hasCommandActiveThreadLightDump();
  /**
   * <code>.v1.PCmdActiveThreadLightDump commandActiveThreadLightDump = 750;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDump getCommandActiveThreadLightDump();
  /**
   * <code>.v1.PCmdActiveThreadLightDump commandActiveThreadLightDump = 750;</code>
   */
  com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpOrBuilder getCommandActiveThreadLightDumpOrBuilder();

  public com.navercorp.pinpoint.grpc.trace.PCmdRequest.CommandCase getCommandCase();
}
