// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Annotation.proto

package com.navercorp.pinpoint.grpc.trace;

/**
 * Protobuf type {@code PIntStringStringValue}
 */
public  final class PIntStringStringValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PIntStringStringValue)
    PIntStringStringValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PIntStringStringValue.newBuilder() to construct.
  private PIntStringStringValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PIntStringStringValue() {
    intValue_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PIntStringStringValue(
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

            intValue_ = input.readInt32();
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (stringValue1_ != null) {
              subBuilder = stringValue1_.toBuilder();
            }
            stringValue1_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stringValue1_);
              stringValue1_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (stringValue2_ != null) {
              subBuilder = stringValue2_.toBuilder();
            }
            stringValue2_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stringValue2_);
              stringValue2_ = subBuilder.buildPartial();
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
    return com.navercorp.pinpoint.grpc.trace.AnnotationProto.internal_static_PIntStringStringValue_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.navercorp.pinpoint.grpc.trace.AnnotationProto.internal_static_PIntStringStringValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.navercorp.pinpoint.grpc.trace.PIntStringStringValue.class, com.navercorp.pinpoint.grpc.trace.PIntStringStringValue.Builder.class);
  }

  public static final int INTVALUE_FIELD_NUMBER = 1;
  private int intValue_;
  /**
   * <code>int32 intValue = 1;</code>
   */
  public int getIntValue() {
    return intValue_;
  }

  public static final int STRINGVALUE1_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue stringValue1_;
  /**
   * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
   */
  public boolean hasStringValue1() {
    return stringValue1_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
   */
  public com.google.protobuf.StringValue getStringValue1() {
    return stringValue1_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue1_;
  }
  /**
   * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getStringValue1OrBuilder() {
    return getStringValue1();
  }

  public static final int STRINGVALUE2_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue stringValue2_;
  /**
   * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
   */
  public boolean hasStringValue2() {
    return stringValue2_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
   */
  public com.google.protobuf.StringValue getStringValue2() {
    return stringValue2_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue2_;
  }
  /**
   * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getStringValue2OrBuilder() {
    return getStringValue2();
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
    if (intValue_ != 0) {
      output.writeInt32(1, intValue_);
    }
    if (stringValue1_ != null) {
      output.writeMessage(2, getStringValue1());
    }
    if (stringValue2_ != null) {
      output.writeMessage(3, getStringValue2());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (intValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, intValue_);
    }
    if (stringValue1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStringValue1());
    }
    if (stringValue2_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStringValue2());
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
    if (!(obj instanceof com.navercorp.pinpoint.grpc.trace.PIntStringStringValue)) {
      return super.equals(obj);
    }
    com.navercorp.pinpoint.grpc.trace.PIntStringStringValue other = (com.navercorp.pinpoint.grpc.trace.PIntStringStringValue) obj;

    boolean result = true;
    result = result && (getIntValue()
        == other.getIntValue());
    result = result && (hasStringValue1() == other.hasStringValue1());
    if (hasStringValue1()) {
      result = result && getStringValue1()
          .equals(other.getStringValue1());
    }
    result = result && (hasStringValue2() == other.hasStringValue2());
    if (hasStringValue2()) {
      result = result && getStringValue2()
          .equals(other.getStringValue2());
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
    hash = (37 * hash) + INTVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getIntValue();
    if (hasStringValue1()) {
      hash = (37 * hash) + STRINGVALUE1_FIELD_NUMBER;
      hash = (53 * hash) + getStringValue1().hashCode();
    }
    if (hasStringValue2()) {
      hash = (37 * hash) + STRINGVALUE2_FIELD_NUMBER;
      hash = (53 * hash) + getStringValue2().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parseFrom(
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
  public static Builder newBuilder(com.navercorp.pinpoint.grpc.trace.PIntStringStringValue prototype) {
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
   * Protobuf type {@code PIntStringStringValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PIntStringStringValue)
      com.navercorp.pinpoint.grpc.trace.PIntStringStringValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.AnnotationProto.internal_static_PIntStringStringValue_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navercorp.pinpoint.grpc.trace.AnnotationProto.internal_static_PIntStringStringValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.navercorp.pinpoint.grpc.trace.PIntStringStringValue.class, com.navercorp.pinpoint.grpc.trace.PIntStringStringValue.Builder.class);
    }

    // Construct using com.navercorp.pinpoint.grpc.trace.PIntStringStringValue.newBuilder()
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
      intValue_ = 0;

      if (stringValue1Builder_ == null) {
        stringValue1_ = null;
      } else {
        stringValue1_ = null;
        stringValue1Builder_ = null;
      }
      if (stringValue2Builder_ == null) {
        stringValue2_ = null;
      } else {
        stringValue2_ = null;
        stringValue2Builder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.navercorp.pinpoint.grpc.trace.AnnotationProto.internal_static_PIntStringStringValue_descriptor;
    }

    public com.navercorp.pinpoint.grpc.trace.PIntStringStringValue getDefaultInstanceForType() {
      return com.navercorp.pinpoint.grpc.trace.PIntStringStringValue.getDefaultInstance();
    }

    public com.navercorp.pinpoint.grpc.trace.PIntStringStringValue build() {
      com.navercorp.pinpoint.grpc.trace.PIntStringStringValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.navercorp.pinpoint.grpc.trace.PIntStringStringValue buildPartial() {
      com.navercorp.pinpoint.grpc.trace.PIntStringStringValue result = new com.navercorp.pinpoint.grpc.trace.PIntStringStringValue(this);
      result.intValue_ = intValue_;
      if (stringValue1Builder_ == null) {
        result.stringValue1_ = stringValue1_;
      } else {
        result.stringValue1_ = stringValue1Builder_.build();
      }
      if (stringValue2Builder_ == null) {
        result.stringValue2_ = stringValue2_;
      } else {
        result.stringValue2_ = stringValue2Builder_.build();
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
      if (other instanceof com.navercorp.pinpoint.grpc.trace.PIntStringStringValue) {
        return mergeFrom((com.navercorp.pinpoint.grpc.trace.PIntStringStringValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.navercorp.pinpoint.grpc.trace.PIntStringStringValue other) {
      if (other == com.navercorp.pinpoint.grpc.trace.PIntStringStringValue.getDefaultInstance()) return this;
      if (other.getIntValue() != 0) {
        setIntValue(other.getIntValue());
      }
      if (other.hasStringValue1()) {
        mergeStringValue1(other.getStringValue1());
      }
      if (other.hasStringValue2()) {
        mergeStringValue2(other.getStringValue2());
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
      com.navercorp.pinpoint.grpc.trace.PIntStringStringValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.navercorp.pinpoint.grpc.trace.PIntStringStringValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int intValue_ ;
    /**
     * <code>int32 intValue = 1;</code>
     */
    public int getIntValue() {
      return intValue_;
    }
    /**
     * <code>int32 intValue = 1;</code>
     */
    public Builder setIntValue(int value) {
      
      intValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 intValue = 1;</code>
     */
    public Builder clearIntValue() {
      
      intValue_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue stringValue1_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> stringValue1Builder_;
    /**
     * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
     */
    public boolean hasStringValue1() {
      return stringValue1Builder_ != null || stringValue1_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
     */
    public com.google.protobuf.StringValue getStringValue1() {
      if (stringValue1Builder_ == null) {
        return stringValue1_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue1_;
      } else {
        return stringValue1Builder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
     */
    public Builder setStringValue1(com.google.protobuf.StringValue value) {
      if (stringValue1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stringValue1_ = value;
        onChanged();
      } else {
        stringValue1Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
     */
    public Builder setStringValue1(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (stringValue1Builder_ == null) {
        stringValue1_ = builderForValue.build();
        onChanged();
      } else {
        stringValue1Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
     */
    public Builder mergeStringValue1(com.google.protobuf.StringValue value) {
      if (stringValue1Builder_ == null) {
        if (stringValue1_ != null) {
          stringValue1_ =
            com.google.protobuf.StringValue.newBuilder(stringValue1_).mergeFrom(value).buildPartial();
        } else {
          stringValue1_ = value;
        }
        onChanged();
      } else {
        stringValue1Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
     */
    public Builder clearStringValue1() {
      if (stringValue1Builder_ == null) {
        stringValue1_ = null;
        onChanged();
      } else {
        stringValue1_ = null;
        stringValue1Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getStringValue1Builder() {
      
      onChanged();
      return getStringValue1FieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getStringValue1OrBuilder() {
      if (stringValue1Builder_ != null) {
        return stringValue1Builder_.getMessageOrBuilder();
      } else {
        return stringValue1_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : stringValue1_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue stringValue1 = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getStringValue1FieldBuilder() {
      if (stringValue1Builder_ == null) {
        stringValue1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getStringValue1(),
                getParentForChildren(),
                isClean());
        stringValue1_ = null;
      }
      return stringValue1Builder_;
    }

    private com.google.protobuf.StringValue stringValue2_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> stringValue2Builder_;
    /**
     * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
     */
    public boolean hasStringValue2() {
      return stringValue2Builder_ != null || stringValue2_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
     */
    public com.google.protobuf.StringValue getStringValue2() {
      if (stringValue2Builder_ == null) {
        return stringValue2_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue2_;
      } else {
        return stringValue2Builder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
     */
    public Builder setStringValue2(com.google.protobuf.StringValue value) {
      if (stringValue2Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stringValue2_ = value;
        onChanged();
      } else {
        stringValue2Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
     */
    public Builder setStringValue2(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (stringValue2Builder_ == null) {
        stringValue2_ = builderForValue.build();
        onChanged();
      } else {
        stringValue2Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
     */
    public Builder mergeStringValue2(com.google.protobuf.StringValue value) {
      if (stringValue2Builder_ == null) {
        if (stringValue2_ != null) {
          stringValue2_ =
            com.google.protobuf.StringValue.newBuilder(stringValue2_).mergeFrom(value).buildPartial();
        } else {
          stringValue2_ = value;
        }
        onChanged();
      } else {
        stringValue2Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
     */
    public Builder clearStringValue2() {
      if (stringValue2Builder_ == null) {
        stringValue2_ = null;
        onChanged();
      } else {
        stringValue2_ = null;
        stringValue2Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getStringValue2Builder() {
      
      onChanged();
      return getStringValue2FieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getStringValue2OrBuilder() {
      if (stringValue2Builder_ != null) {
        return stringValue2Builder_.getMessageOrBuilder();
      } else {
        return stringValue2_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : stringValue2_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue stringValue2 = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getStringValue2FieldBuilder() {
      if (stringValue2Builder_ == null) {
        stringValue2Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getStringValue2(),
                getParentForChildren(),
                isClean());
        stringValue2_ = null;
      }
      return stringValue2Builder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:PIntStringStringValue)
  }

  // @@protoc_insertion_point(class_scope:PIntStringStringValue)
  private static final com.navercorp.pinpoint.grpc.trace.PIntStringStringValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.navercorp.pinpoint.grpc.trace.PIntStringStringValue();
  }

  public static com.navercorp.pinpoint.grpc.trace.PIntStringStringValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PIntStringStringValue>
      PARSER = new com.google.protobuf.AbstractParser<PIntStringStringValue>() {
    public PIntStringStringValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PIntStringStringValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PIntStringStringValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PIntStringStringValue> getParserForType() {
    return PARSER;
  }

  public com.navercorp.pinpoint.grpc.trace.PIntStringStringValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
