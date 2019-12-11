// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Span.proto

package com.navercorp.pinpoint.grpc.trace;

/**
 * Protobuf type {@code v1.PAcceptEvent}
 */
public  final class PAcceptEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v1.PAcceptEvent)
    PAcceptEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PAcceptEvent.newBuilder() to construct.
  private PAcceptEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PAcceptEvent() {
    rpc_ = "";
    endPoint_ = "";
    remoteAddr_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PAcceptEvent(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            rpc_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            endPoint_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            remoteAddr_ = s;
            break;
          }
          case 34: {
            com.navercorp.pinpoint.grpc.trace.PParentInfo.Builder subBuilder = null;
            if (parentInfo_ != null) {
              subBuilder = parentInfo_.toBuilder();
            }
            parentInfo_ = input.readMessage(com.navercorp.pinpoint.grpc.trace.PParentInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(parentInfo_);
              parentInfo_ = subBuilder.buildPartial();
            }

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
    return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PAcceptEvent_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PAcceptEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.navercorp.pinpoint.grpc.trace.PAcceptEvent.class, com.navercorp.pinpoint.grpc.trace.PAcceptEvent.Builder.class);
  }

  public static final int RPC_FIELD_NUMBER = 1;
  private volatile java.lang.Object rpc_;
  /**
   * <code>string rpc = 1;</code>
   */
  public java.lang.String getRpc() {
    java.lang.Object ref = rpc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rpc_ = s;
      return s;
    }
  }
  /**
   * <code>string rpc = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRpcBytes() {
    java.lang.Object ref = rpc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rpc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDPOINT_FIELD_NUMBER = 2;
  private volatile java.lang.Object endPoint_;
  /**
   * <code>string endPoint = 2;</code>
   */
  public java.lang.String getEndPoint() {
    java.lang.Object ref = endPoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endPoint_ = s;
      return s;
    }
  }
  /**
   * <code>string endPoint = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEndPointBytes() {
    java.lang.Object ref = endPoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endPoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REMOTEADDR_FIELD_NUMBER = 3;
  private volatile java.lang.Object remoteAddr_;
  /**
   * <code>string remoteAddr = 3;</code>
   */
  public java.lang.String getRemoteAddr() {
    java.lang.Object ref = remoteAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remoteAddr_ = s;
      return s;
    }
  }
  /**
   * <code>string remoteAddr = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRemoteAddrBytes() {
    java.lang.Object ref = remoteAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remoteAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENTINFO_FIELD_NUMBER = 4;
  private com.navercorp.pinpoint.grpc.trace.PParentInfo parentInfo_;
  /**
   * <code>.v1.PParentInfo parentInfo = 4;</code>
   */
  public boolean hasParentInfo() {
    return parentInfo_ != null;
  }
  /**
   * <code>.v1.PParentInfo parentInfo = 4;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PParentInfo getParentInfo() {
    return parentInfo_ == null ? com.navercorp.pinpoint.grpc.trace.PParentInfo.getDefaultInstance() : parentInfo_;
  }
  /**
   * <code>.v1.PParentInfo parentInfo = 4;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PParentInfoOrBuilder getParentInfoOrBuilder() {
    return getParentInfo();
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
    if (!getRpcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rpc_);
    }
    if (!getEndPointBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, endPoint_);
    }
    if (!getRemoteAddrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, remoteAddr_);
    }
    if (parentInfo_ != null) {
      output.writeMessage(4, getParentInfo());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRpcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rpc_);
    }
    if (!getEndPointBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, endPoint_);
    }
    if (!getRemoteAddrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, remoteAddr_);
    }
    if (parentInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getParentInfo());
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
    if (!(obj instanceof com.navercorp.pinpoint.grpc.trace.PAcceptEvent)) {
      return super.equals(obj);
    }
    com.navercorp.pinpoint.grpc.trace.PAcceptEvent other = (com.navercorp.pinpoint.grpc.trace.PAcceptEvent) obj;

    boolean result = true;
    result = result && getRpc()
        .equals(other.getRpc());
    result = result && getEndPoint()
        .equals(other.getEndPoint());
    result = result && getRemoteAddr()
        .equals(other.getRemoteAddr());
    result = result && (hasParentInfo() == other.hasParentInfo());
    if (hasParentInfo()) {
      result = result && getParentInfo()
          .equals(other.getParentInfo());
    }
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
    hash = (37 * hash) + RPC_FIELD_NUMBER;
    hash = (53 * hash) + getRpc().hashCode();
    hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getEndPoint().hashCode();
    hash = (37 * hash) + REMOTEADDR_FIELD_NUMBER;
    hash = (53 * hash) + getRemoteAddr().hashCode();
    if (hasParentInfo()) {
      hash = (37 * hash) + PARENTINFO_FIELD_NUMBER;
      hash = (53 * hash) + getParentInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent parseFrom(
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
  public static Builder newBuilder(com.navercorp.pinpoint.grpc.trace.PAcceptEvent prototype) {
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
   * Protobuf type {@code v1.PAcceptEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v1.PAcceptEvent)
      com.navercorp.pinpoint.grpc.trace.PAcceptEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PAcceptEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PAcceptEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.navercorp.pinpoint.grpc.trace.PAcceptEvent.class, com.navercorp.pinpoint.grpc.trace.PAcceptEvent.Builder.class);
    }

    // Construct using com.navercorp.pinpoint.grpc.trace.PAcceptEvent.newBuilder()
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
      rpc_ = "";

      endPoint_ = "";

      remoteAddr_ = "";

      if (parentInfoBuilder_ == null) {
        parentInfo_ = null;
      } else {
        parentInfo_ = null;
        parentInfoBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PAcceptEvent_descriptor;
    }

    public com.navercorp.pinpoint.grpc.trace.PAcceptEvent getDefaultInstanceForType() {
      return com.navercorp.pinpoint.grpc.trace.PAcceptEvent.getDefaultInstance();
    }

    public com.navercorp.pinpoint.grpc.trace.PAcceptEvent build() {
      com.navercorp.pinpoint.grpc.trace.PAcceptEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.navercorp.pinpoint.grpc.trace.PAcceptEvent buildPartial() {
      com.navercorp.pinpoint.grpc.trace.PAcceptEvent result = new com.navercorp.pinpoint.grpc.trace.PAcceptEvent(this);
      result.rpc_ = rpc_;
      result.endPoint_ = endPoint_;
      result.remoteAddr_ = remoteAddr_;
      if (parentInfoBuilder_ == null) {
        result.parentInfo_ = parentInfo_;
      } else {
        result.parentInfo_ = parentInfoBuilder_.build();
      }
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
      if (other instanceof com.navercorp.pinpoint.grpc.trace.PAcceptEvent) {
        return mergeFrom((com.navercorp.pinpoint.grpc.trace.PAcceptEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.navercorp.pinpoint.grpc.trace.PAcceptEvent other) {
      if (other == com.navercorp.pinpoint.grpc.trace.PAcceptEvent.getDefaultInstance()) return this;
      if (!other.getRpc().isEmpty()) {
        rpc_ = other.rpc_;
        onChanged();
      }
      if (!other.getEndPoint().isEmpty()) {
        endPoint_ = other.endPoint_;
        onChanged();
      }
      if (!other.getRemoteAddr().isEmpty()) {
        remoteAddr_ = other.remoteAddr_;
        onChanged();
      }
      if (other.hasParentInfo()) {
        mergeParentInfo(other.getParentInfo());
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
      com.navercorp.pinpoint.grpc.trace.PAcceptEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.navercorp.pinpoint.grpc.trace.PAcceptEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object rpc_ = "";
    /**
     * <code>string rpc = 1;</code>
     */
    public java.lang.String getRpc() {
      java.lang.Object ref = rpc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rpc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rpc = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRpcBytes() {
      java.lang.Object ref = rpc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rpc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rpc = 1;</code>
     */
    public Builder setRpc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rpc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string rpc = 1;</code>
     */
    public Builder clearRpc() {
      
      rpc_ = getDefaultInstance().getRpc();
      onChanged();
      return this;
    }
    /**
     * <code>string rpc = 1;</code>
     */
    public Builder setRpcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rpc_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endPoint_ = "";
    /**
     * <code>string endPoint = 2;</code>
     */
    public java.lang.String getEndPoint() {
      java.lang.Object ref = endPoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endPoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string endPoint = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEndPointBytes() {
      java.lang.Object ref = endPoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endPoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string endPoint = 2;</code>
     */
    public Builder setEndPoint(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endPoint_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string endPoint = 2;</code>
     */
    public Builder clearEndPoint() {
      
      endPoint_ = getDefaultInstance().getEndPoint();
      onChanged();
      return this;
    }
    /**
     * <code>string endPoint = 2;</code>
     */
    public Builder setEndPointBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endPoint_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object remoteAddr_ = "";
    /**
     * <code>string remoteAddr = 3;</code>
     */
    public java.lang.String getRemoteAddr() {
      java.lang.Object ref = remoteAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remoteAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string remoteAddr = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRemoteAddrBytes() {
      java.lang.Object ref = remoteAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remoteAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string remoteAddr = 3;</code>
     */
    public Builder setRemoteAddr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      remoteAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string remoteAddr = 3;</code>
     */
    public Builder clearRemoteAddr() {
      
      remoteAddr_ = getDefaultInstance().getRemoteAddr();
      onChanged();
      return this;
    }
    /**
     * <code>string remoteAddr = 3;</code>
     */
    public Builder setRemoteAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      remoteAddr_ = value;
      onChanged();
      return this;
    }

    private com.navercorp.pinpoint.grpc.trace.PParentInfo parentInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PParentInfo, com.navercorp.pinpoint.grpc.trace.PParentInfo.Builder, com.navercorp.pinpoint.grpc.trace.PParentInfoOrBuilder> parentInfoBuilder_;
    /**
     * <code>.v1.PParentInfo parentInfo = 4;</code>
     */
    public boolean hasParentInfo() {
      return parentInfoBuilder_ != null || parentInfo_ != null;
    }
    /**
     * <code>.v1.PParentInfo parentInfo = 4;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PParentInfo getParentInfo() {
      if (parentInfoBuilder_ == null) {
        return parentInfo_ == null ? com.navercorp.pinpoint.grpc.trace.PParentInfo.getDefaultInstance() : parentInfo_;
      } else {
        return parentInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.v1.PParentInfo parentInfo = 4;</code>
     */
    public Builder setParentInfo(com.navercorp.pinpoint.grpc.trace.PParentInfo value) {
      if (parentInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parentInfo_ = value;
        onChanged();
      } else {
        parentInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v1.PParentInfo parentInfo = 4;</code>
     */
    public Builder setParentInfo(
        com.navercorp.pinpoint.grpc.trace.PParentInfo.Builder builderForValue) {
      if (parentInfoBuilder_ == null) {
        parentInfo_ = builderForValue.build();
        onChanged();
      } else {
        parentInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v1.PParentInfo parentInfo = 4;</code>
     */
    public Builder mergeParentInfo(com.navercorp.pinpoint.grpc.trace.PParentInfo value) {
      if (parentInfoBuilder_ == null) {
        if (parentInfo_ != null) {
          parentInfo_ =
            com.navercorp.pinpoint.grpc.trace.PParentInfo.newBuilder(parentInfo_).mergeFrom(value).buildPartial();
        } else {
          parentInfo_ = value;
        }
        onChanged();
      } else {
        parentInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v1.PParentInfo parentInfo = 4;</code>
     */
    public Builder clearParentInfo() {
      if (parentInfoBuilder_ == null) {
        parentInfo_ = null;
        onChanged();
      } else {
        parentInfo_ = null;
        parentInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v1.PParentInfo parentInfo = 4;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PParentInfo.Builder getParentInfoBuilder() {
      
      onChanged();
      return getParentInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.v1.PParentInfo parentInfo = 4;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PParentInfoOrBuilder getParentInfoOrBuilder() {
      if (parentInfoBuilder_ != null) {
        return parentInfoBuilder_.getMessageOrBuilder();
      } else {
        return parentInfo_ == null ?
            com.navercorp.pinpoint.grpc.trace.PParentInfo.getDefaultInstance() : parentInfo_;
      }
    }
    /**
     * <code>.v1.PParentInfo parentInfo = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PParentInfo, com.navercorp.pinpoint.grpc.trace.PParentInfo.Builder, com.navercorp.pinpoint.grpc.trace.PParentInfoOrBuilder> 
        getParentInfoFieldBuilder() {
      if (parentInfoBuilder_ == null) {
        parentInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.navercorp.pinpoint.grpc.trace.PParentInfo, com.navercorp.pinpoint.grpc.trace.PParentInfo.Builder, com.navercorp.pinpoint.grpc.trace.PParentInfoOrBuilder>(
                getParentInfo(),
                getParentForChildren(),
                isClean());
        parentInfo_ = null;
      }
      return parentInfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v1.PAcceptEvent)
  }

  // @@protoc_insertion_point(class_scope:v1.PAcceptEvent)
  private static final com.navercorp.pinpoint.grpc.trace.PAcceptEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.navercorp.pinpoint.grpc.trace.PAcceptEvent();
  }

  public static com.navercorp.pinpoint.grpc.trace.PAcceptEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PAcceptEvent>
      PARSER = new com.google.protobuf.AbstractParser<PAcceptEvent>() {
    public PAcceptEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PAcceptEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PAcceptEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PAcceptEvent> getParserForType() {
    return PARSER;
  }

  public com.navercorp.pinpoint.grpc.trace.PAcceptEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
