// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ThreadDump.proto

package com.navercorp.pinpoint.grpc.trace;

/**
 * Protobuf type {@code v1.PActiveThreadLightDump}
 */
public  final class PActiveThreadLightDump extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v1.PActiveThreadLightDump)
    PActiveThreadLightDumpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PActiveThreadLightDump.newBuilder() to construct.
  private PActiveThreadLightDump(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PActiveThreadLightDump() {
    startTime_ = 0L;
    localTraceId_ = 0L;
    sampled_ = false;
    transactionId_ = "";
    entryPoint_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PActiveThreadLightDump(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            startTime_ = input.readInt64();
            break;
          }
          case 16: {

            localTraceId_ = input.readInt64();
            break;
          }
          case 26: {
            com.navercorp.pinpoint.grpc.trace.PThreadLightDump.Builder subBuilder = null;
            if (threadDump_ != null) {
              subBuilder = threadDump_.toBuilder();
            }
            threadDump_ = input.readMessage(com.navercorp.pinpoint.grpc.trace.PThreadLightDump.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(threadDump_);
              threadDump_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            sampled_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            transactionId_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            entryPoint_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.navercorp.pinpoint.grpc.trace.ThreadDumpProto.internal_static_v1_PActiveThreadLightDump_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.navercorp.pinpoint.grpc.trace.ThreadDumpProto.internal_static_v1_PActiveThreadLightDump_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump.class, com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump.Builder.class);
  }

  public static final int STARTTIME_FIELD_NUMBER = 1;
  private long startTime_;
  /**
   * <code>int64 startTime = 1;</code>
   */
  public long getStartTime() {
    return startTime_;
  }

  public static final int LOCALTRACEID_FIELD_NUMBER = 2;
  private long localTraceId_;
  /**
   * <code>int64 localTraceId = 2;</code>
   */
  public long getLocalTraceId() {
    return localTraceId_;
  }

  public static final int THREADDUMP_FIELD_NUMBER = 3;
  private com.navercorp.pinpoint.grpc.trace.PThreadLightDump threadDump_;
  /**
   * <code>.v1.PThreadLightDump threadDump = 3;</code>
   */
  public boolean hasThreadDump() {
    return threadDump_ != null;
  }
  /**
   * <code>.v1.PThreadLightDump threadDump = 3;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PThreadLightDump getThreadDump() {
    return threadDump_ == null ? com.navercorp.pinpoint.grpc.trace.PThreadLightDump.getDefaultInstance() : threadDump_;
  }
  /**
   * <code>.v1.PThreadLightDump threadDump = 3;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PThreadLightDumpOrBuilder getThreadDumpOrBuilder() {
    return getThreadDump();
  }

  public static final int SAMPLED_FIELD_NUMBER = 4;
  private boolean sampled_;
  /**
   * <code>bool sampled = 4;</code>
   */
  public boolean getSampled() {
    return sampled_;
  }

  public static final int TRANSACTIONID_FIELD_NUMBER = 5;
  private volatile java.lang.Object transactionId_;
  /**
   * <code>string transactionId = 5;</code>
   */
  public java.lang.String getTransactionId() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transactionId_ = s;
      return s;
    }
  }
  /**
   * <code>string transactionId = 5;</code>
   */
  public com.google.protobuf.ByteString
      getTransactionIdBytes() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transactionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTRYPOINT_FIELD_NUMBER = 6;
  private volatile java.lang.Object entryPoint_;
  /**
   * <code>string entryPoint = 6;</code>
   */
  public java.lang.String getEntryPoint() {
    java.lang.Object ref = entryPoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entryPoint_ = s;
      return s;
    }
  }
  /**
   * <code>string entryPoint = 6;</code>
   */
  public com.google.protobuf.ByteString
      getEntryPointBytes() {
    java.lang.Object ref = entryPoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entryPoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (startTime_ != 0L) {
      output.writeInt64(1, startTime_);
    }
    if (localTraceId_ != 0L) {
      output.writeInt64(2, localTraceId_);
    }
    if (threadDump_ != null) {
      output.writeMessage(3, getThreadDump());
    }
    if (sampled_ != false) {
      output.writeBool(4, sampled_);
    }
    if (!getTransactionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, transactionId_);
    }
    if (!getEntryPointBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, entryPoint_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, startTime_);
    }
    if (localTraceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, localTraceId_);
    }
    if (threadDump_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getThreadDump());
    }
    if (sampled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, sampled_);
    }
    if (!getTransactionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, transactionId_);
    }
    if (!getEntryPointBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, entryPoint_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump)) {
      return super.equals(obj);
    }
    com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump other = (com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump) obj;

    boolean result = true;
    result = result && (getStartTime()
        == other.getStartTime());
    result = result && (getLocalTraceId()
        == other.getLocalTraceId());
    result = result && (hasThreadDump() == other.hasThreadDump());
    if (hasThreadDump()) {
      result = result && getThreadDump()
          .equals(other.getThreadDump());
    }
    result = result && (getSampled()
        == other.getSampled());
    result = result && getTransactionId()
        .equals(other.getTransactionId());
    result = result && getEntryPoint()
        .equals(other.getEntryPoint());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (37 * hash) + LOCALTRACEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLocalTraceId());
    if (hasThreadDump()) {
      hash = (37 * hash) + THREADDUMP_FIELD_NUMBER;
      hash = (53 * hash) + getThreadDump().hashCode();
    }
    hash = (37 * hash) + SAMPLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSampled());
    hash = (37 * hash) + TRANSACTIONID_FIELD_NUMBER;
    hash = (53 * hash) + getTransactionId().hashCode();
    hash = (37 * hash) + ENTRYPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getEntryPoint().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code v1.PActiveThreadLightDump}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v1.PActiveThreadLightDump)
      com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDumpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.ThreadDumpProto.internal_static_v1_PActiveThreadLightDump_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navercorp.pinpoint.grpc.trace.ThreadDumpProto.internal_static_v1_PActiveThreadLightDump_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump.class, com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump.Builder.class);
    }

    // Construct using com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      startTime_ = 0L;

      localTraceId_ = 0L;

      if (threadDumpBuilder_ == null) {
        threadDump_ = null;
      } else {
        threadDump_ = null;
        threadDumpBuilder_ = null;
      }
      sampled_ = false;

      transactionId_ = "";

      entryPoint_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.navercorp.pinpoint.grpc.trace.ThreadDumpProto.internal_static_v1_PActiveThreadLightDump_descriptor;
    }

    public com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump getDefaultInstanceForType() {
      return com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump.getDefaultInstance();
    }

    public com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump build() {
      com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump buildPartial() {
      com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump result = new com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump(this);
      result.startTime_ = startTime_;
      result.localTraceId_ = localTraceId_;
      if (threadDumpBuilder_ == null) {
        result.threadDump_ = threadDump_;
      } else {
        result.threadDump_ = threadDumpBuilder_.build();
      }
      result.sampled_ = sampled_;
      result.transactionId_ = transactionId_;
      result.entryPoint_ = entryPoint_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump) {
        return mergeFrom((com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump other) {
      if (other == com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump.getDefaultInstance()) return this;
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
      }
      if (other.getLocalTraceId() != 0L) {
        setLocalTraceId(other.getLocalTraceId());
      }
      if (other.hasThreadDump()) {
        mergeThreadDump(other.getThreadDump());
      }
      if (other.getSampled() != false) {
        setSampled(other.getSampled());
      }
      if (!other.getTransactionId().isEmpty()) {
        transactionId_ = other.transactionId_;
        onChanged();
      }
      if (!other.getEntryPoint().isEmpty()) {
        entryPoint_ = other.entryPoint_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long startTime_ ;
    /**
     * <code>int64 startTime = 1;</code>
     */
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <code>int64 startTime = 1;</code>
     */
    public Builder setStartTime(long value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 startTime = 1;</code>
     */
    public Builder clearStartTime() {
      
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private long localTraceId_ ;
    /**
     * <code>int64 localTraceId = 2;</code>
     */
    public long getLocalTraceId() {
      return localTraceId_;
    }
    /**
     * <code>int64 localTraceId = 2;</code>
     */
    public Builder setLocalTraceId(long value) {
      
      localTraceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 localTraceId = 2;</code>
     */
    public Builder clearLocalTraceId() {
      
      localTraceId_ = 0L;
      onChanged();
      return this;
    }

    private com.navercorp.pinpoint.grpc.trace.PThreadLightDump threadDump_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PThreadLightDump, com.navercorp.pinpoint.grpc.trace.PThreadLightDump.Builder, com.navercorp.pinpoint.grpc.trace.PThreadLightDumpOrBuilder> threadDumpBuilder_;
    /**
     * <code>.v1.PThreadLightDump threadDump = 3;</code>
     */
    public boolean hasThreadDump() {
      return threadDumpBuilder_ != null || threadDump_ != null;
    }
    /**
     * <code>.v1.PThreadLightDump threadDump = 3;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PThreadLightDump getThreadDump() {
      if (threadDumpBuilder_ == null) {
        return threadDump_ == null ? com.navercorp.pinpoint.grpc.trace.PThreadLightDump.getDefaultInstance() : threadDump_;
      } else {
        return threadDumpBuilder_.getMessage();
      }
    }
    /**
     * <code>.v1.PThreadLightDump threadDump = 3;</code>
     */
    public Builder setThreadDump(com.navercorp.pinpoint.grpc.trace.PThreadLightDump value) {
      if (threadDumpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        threadDump_ = value;
        onChanged();
      } else {
        threadDumpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v1.PThreadLightDump threadDump = 3;</code>
     */
    public Builder setThreadDump(
        com.navercorp.pinpoint.grpc.trace.PThreadLightDump.Builder builderForValue) {
      if (threadDumpBuilder_ == null) {
        threadDump_ = builderForValue.build();
        onChanged();
      } else {
        threadDumpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v1.PThreadLightDump threadDump = 3;</code>
     */
    public Builder mergeThreadDump(com.navercorp.pinpoint.grpc.trace.PThreadLightDump value) {
      if (threadDumpBuilder_ == null) {
        if (threadDump_ != null) {
          threadDump_ =
            com.navercorp.pinpoint.grpc.trace.PThreadLightDump.newBuilder(threadDump_).mergeFrom(value).buildPartial();
        } else {
          threadDump_ = value;
        }
        onChanged();
      } else {
        threadDumpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v1.PThreadLightDump threadDump = 3;</code>
     */
    public Builder clearThreadDump() {
      if (threadDumpBuilder_ == null) {
        threadDump_ = null;
        onChanged();
      } else {
        threadDump_ = null;
        threadDumpBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v1.PThreadLightDump threadDump = 3;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PThreadLightDump.Builder getThreadDumpBuilder() {
      
      onChanged();
      return getThreadDumpFieldBuilder().getBuilder();
    }
    /**
     * <code>.v1.PThreadLightDump threadDump = 3;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PThreadLightDumpOrBuilder getThreadDumpOrBuilder() {
      if (threadDumpBuilder_ != null) {
        return threadDumpBuilder_.getMessageOrBuilder();
      } else {
        return threadDump_ == null ?
            com.navercorp.pinpoint.grpc.trace.PThreadLightDump.getDefaultInstance() : threadDump_;
      }
    }
    /**
     * <code>.v1.PThreadLightDump threadDump = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PThreadLightDump, com.navercorp.pinpoint.grpc.trace.PThreadLightDump.Builder, com.navercorp.pinpoint.grpc.trace.PThreadLightDumpOrBuilder> 
        getThreadDumpFieldBuilder() {
      if (threadDumpBuilder_ == null) {
        threadDumpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.navercorp.pinpoint.grpc.trace.PThreadLightDump, com.navercorp.pinpoint.grpc.trace.PThreadLightDump.Builder, com.navercorp.pinpoint.grpc.trace.PThreadLightDumpOrBuilder>(
                getThreadDump(),
                getParentForChildren(),
                isClean());
        threadDump_ = null;
      }
      return threadDumpBuilder_;
    }

    private boolean sampled_ ;
    /**
     * <code>bool sampled = 4;</code>
     */
    public boolean getSampled() {
      return sampled_;
    }
    /**
     * <code>bool sampled = 4;</code>
     */
    public Builder setSampled(boolean value) {
      
      sampled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool sampled = 4;</code>
     */
    public Builder clearSampled() {
      
      sampled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object transactionId_ = "";
    /**
     * <code>string transactionId = 5;</code>
     */
    public java.lang.String getTransactionId() {
      java.lang.Object ref = transactionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transactionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string transactionId = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTransactionIdBytes() {
      java.lang.Object ref = transactionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string transactionId = 5;</code>
     */
    public Builder setTransactionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transactionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string transactionId = 5;</code>
     */
    public Builder clearTransactionId() {
      
      transactionId_ = getDefaultInstance().getTransactionId();
      onChanged();
      return this;
    }
    /**
     * <code>string transactionId = 5;</code>
     */
    public Builder setTransactionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      transactionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object entryPoint_ = "";
    /**
     * <code>string entryPoint = 6;</code>
     */
    public java.lang.String getEntryPoint() {
      java.lang.Object ref = entryPoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entryPoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string entryPoint = 6;</code>
     */
    public com.google.protobuf.ByteString
        getEntryPointBytes() {
      java.lang.Object ref = entryPoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entryPoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string entryPoint = 6;</code>
     */
    public Builder setEntryPoint(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entryPoint_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string entryPoint = 6;</code>
     */
    public Builder clearEntryPoint() {
      
      entryPoint_ = getDefaultInstance().getEntryPoint();
      onChanged();
      return this;
    }
    /**
     * <code>string entryPoint = 6;</code>
     */
    public Builder setEntryPointBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entryPoint_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v1.PActiveThreadLightDump)
  }

  // @@protoc_insertion_point(class_scope:v1.PActiveThreadLightDump)
  private static final com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump();
  }

  public static com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PActiveThreadLightDump>
      PARSER = new com.google.protobuf.AbstractParser<PActiveThreadLightDump>() {
    public PActiveThreadLightDump parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PActiveThreadLightDump(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PActiveThreadLightDump> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PActiveThreadLightDump> getParserForType() {
    return PARSER;
  }

  public com.navercorp.pinpoint.grpc.trace.PActiveThreadLightDump getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

