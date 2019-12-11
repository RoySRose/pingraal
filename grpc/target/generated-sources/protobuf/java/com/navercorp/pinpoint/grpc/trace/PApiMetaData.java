// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Span.proto

package com.navercorp.pinpoint.grpc.trace;

/**
 * Protobuf type {@code v1.PApiMetaData}
 */
public  final class PApiMetaData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v1.PApiMetaData)
    PApiMetaDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PApiMetaData.newBuilder() to construct.
  private PApiMetaData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PApiMetaData() {
    apiId_ = 0;
    apiInfo_ = "";
    line_ = 0;
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PApiMetaData(
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

            apiId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            apiInfo_ = s;
            break;
          }
          case 24: {

            line_ = input.readInt32();
            break;
          }
          case 32: {

            type_ = input.readInt32();
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
    return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PApiMetaData_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PApiMetaData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.navercorp.pinpoint.grpc.trace.PApiMetaData.class, com.navercorp.pinpoint.grpc.trace.PApiMetaData.Builder.class);
  }

  public static final int APIID_FIELD_NUMBER = 1;
  private int apiId_;
  /**
   * <code>int32 apiId = 1;</code>
   */
  public int getApiId() {
    return apiId_;
  }

  public static final int APIINFO_FIELD_NUMBER = 2;
  private volatile java.lang.Object apiInfo_;
  /**
   * <code>string apiInfo = 2;</code>
   */
  public java.lang.String getApiInfo() {
    java.lang.Object ref = apiInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string apiInfo = 2;</code>
   */
  public com.google.protobuf.ByteString
      getApiInfoBytes() {
    java.lang.Object ref = apiInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      apiInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINE_FIELD_NUMBER = 3;
  private int line_;
  /**
   * <code>int32 line = 3;</code>
   */
  public int getLine() {
    return line_;
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_;
  /**
   * <code>int32 type = 4;</code>
   */
  public int getType() {
    return type_;
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
    if (apiId_ != 0) {
      output.writeInt32(1, apiId_);
    }
    if (!getApiInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, apiInfo_);
    }
    if (line_ != 0) {
      output.writeInt32(3, line_);
    }
    if (type_ != 0) {
      output.writeInt32(4, type_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (apiId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, apiId_);
    }
    if (!getApiInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, apiInfo_);
    }
    if (line_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, line_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, type_);
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
    if (!(obj instanceof com.navercorp.pinpoint.grpc.trace.PApiMetaData)) {
      return super.equals(obj);
    }
    com.navercorp.pinpoint.grpc.trace.PApiMetaData other = (com.navercorp.pinpoint.grpc.trace.PApiMetaData) obj;

    boolean result = true;
    result = result && (getApiId()
        == other.getApiId());
    result = result && getApiInfo()
        .equals(other.getApiInfo());
    result = result && (getLine()
        == other.getLine());
    result = result && (getType()
        == other.getType());
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
    hash = (37 * hash) + APIID_FIELD_NUMBER;
    hash = (53 * hash) + getApiId();
    hash = (37 * hash) + APIINFO_FIELD_NUMBER;
    hash = (53 * hash) + getApiInfo().hashCode();
    hash = (37 * hash) + LINE_FIELD_NUMBER;
    hash = (53 * hash) + getLine();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData parseFrom(
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
  public static Builder newBuilder(com.navercorp.pinpoint.grpc.trace.PApiMetaData prototype) {
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
   * Protobuf type {@code v1.PApiMetaData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v1.PApiMetaData)
      com.navercorp.pinpoint.grpc.trace.PApiMetaDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PApiMetaData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PApiMetaData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.navercorp.pinpoint.grpc.trace.PApiMetaData.class, com.navercorp.pinpoint.grpc.trace.PApiMetaData.Builder.class);
    }

    // Construct using com.navercorp.pinpoint.grpc.trace.PApiMetaData.newBuilder()
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
      apiId_ = 0;

      apiInfo_ = "";

      line_ = 0;

      type_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PApiMetaData_descriptor;
    }

    public com.navercorp.pinpoint.grpc.trace.PApiMetaData getDefaultInstanceForType() {
      return com.navercorp.pinpoint.grpc.trace.PApiMetaData.getDefaultInstance();
    }

    public com.navercorp.pinpoint.grpc.trace.PApiMetaData build() {
      com.navercorp.pinpoint.grpc.trace.PApiMetaData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.navercorp.pinpoint.grpc.trace.PApiMetaData buildPartial() {
      com.navercorp.pinpoint.grpc.trace.PApiMetaData result = new com.navercorp.pinpoint.grpc.trace.PApiMetaData(this);
      result.apiId_ = apiId_;
      result.apiInfo_ = apiInfo_;
      result.line_ = line_;
      result.type_ = type_;
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
      if (other instanceof com.navercorp.pinpoint.grpc.trace.PApiMetaData) {
        return mergeFrom((com.navercorp.pinpoint.grpc.trace.PApiMetaData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.navercorp.pinpoint.grpc.trace.PApiMetaData other) {
      if (other == com.navercorp.pinpoint.grpc.trace.PApiMetaData.getDefaultInstance()) return this;
      if (other.getApiId() != 0) {
        setApiId(other.getApiId());
      }
      if (!other.getApiInfo().isEmpty()) {
        apiInfo_ = other.apiInfo_;
        onChanged();
      }
      if (other.getLine() != 0) {
        setLine(other.getLine());
      }
      if (other.getType() != 0) {
        setType(other.getType());
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
      com.navercorp.pinpoint.grpc.trace.PApiMetaData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.navercorp.pinpoint.grpc.trace.PApiMetaData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int apiId_ ;
    /**
     * <code>int32 apiId = 1;</code>
     */
    public int getApiId() {
      return apiId_;
    }
    /**
     * <code>int32 apiId = 1;</code>
     */
    public Builder setApiId(int value) {
      
      apiId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 apiId = 1;</code>
     */
    public Builder clearApiId() {
      
      apiId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object apiInfo_ = "";
    /**
     * <code>string apiInfo = 2;</code>
     */
    public java.lang.String getApiInfo() {
      java.lang.Object ref = apiInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string apiInfo = 2;</code>
     */
    public com.google.protobuf.ByteString
        getApiInfoBytes() {
      java.lang.Object ref = apiInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        apiInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string apiInfo = 2;</code>
     */
    public Builder setApiInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      apiInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string apiInfo = 2;</code>
     */
    public Builder clearApiInfo() {
      
      apiInfo_ = getDefaultInstance().getApiInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string apiInfo = 2;</code>
     */
    public Builder setApiInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      apiInfo_ = value;
      onChanged();
      return this;
    }

    private int line_ ;
    /**
     * <code>int32 line = 3;</code>
     */
    public int getLine() {
      return line_;
    }
    /**
     * <code>int32 line = 3;</code>
     */
    public Builder setLine(int value) {
      
      line_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 line = 3;</code>
     */
    public Builder clearLine() {
      
      line_ = 0;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <code>int32 type = 4;</code>
     */
    public int getType() {
      return type_;
    }
    /**
     * <code>int32 type = 4;</code>
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 type = 4;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:v1.PApiMetaData)
  }

  // @@protoc_insertion_point(class_scope:v1.PApiMetaData)
  private static final com.navercorp.pinpoint.grpc.trace.PApiMetaData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.navercorp.pinpoint.grpc.trace.PApiMetaData();
  }

  public static com.navercorp.pinpoint.grpc.trace.PApiMetaData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PApiMetaData>
      PARSER = new com.google.protobuf.AbstractParser<PApiMetaData>() {
    public PApiMetaData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PApiMetaData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PApiMetaData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PApiMetaData> getParserForType() {
    return PARSER;
  }

  public com.navercorp.pinpoint.grpc.trace.PApiMetaData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
