// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Annotation.proto

package com.navercorp.pinpoint.grpc.trace;

public interface PIntStringStringValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PIntStringStringValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 intValue = 1;</code>
   */
  int getIntValue();

  /**
   * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
   */
  boolean hasStringValue1();
  /**
   * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
   */
  com.google.protobuf.StringValue getStringValue1();
  /**
   * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getStringValue1OrBuilder();

  /**
   * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
   */
  boolean hasStringValue2();
  /**
   * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
   */
  com.google.protobuf.StringValue getStringValue2();
  /**
   * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getStringValue2OrBuilder();
}