// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Span.proto

package com.navercorp.pinpoint.grpc.trace;

/**
 * Protobuf type {@code v1.PNextEvent}
 */
public  final class PNextEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v1.PNextEvent)
    PNextEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PNextEvent.newBuilder() to construct.
  private PNextEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PNextEvent() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PNextEvent(
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
            com.navercorp.pinpoint.grpc.trace.PMessageEvent.Builder subBuilder = null;
            if (fieldCase_ == 1) {
              subBuilder = ((com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_).toBuilder();
            }
            field_ =
                input.readMessage(com.navercorp.pinpoint.grpc.trace.PMessageEvent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_);
              field_ = subBuilder.buildPartial();
            }
            fieldCase_ = 1;
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
    return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PNextEvent_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PNextEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.navercorp.pinpoint.grpc.trace.PNextEvent.class, com.navercorp.pinpoint.grpc.trace.PNextEvent.Builder.class);
  }

  private int fieldCase_ = 0;
  private java.lang.Object field_;
  public enum FieldCase
      implements com.google.protobuf.Internal.EnumLite {
    MESSAGEEVENT(1),
    FIELD_NOT_SET(0);
    private final int value;
    private FieldCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FieldCase valueOf(int value) {
      return forNumber(value);
    }

    public static FieldCase forNumber(int value) {
      switch (value) {
        case 1: return MESSAGEEVENT;
        case 0: return FIELD_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FieldCase
  getFieldCase() {
    return FieldCase.forNumber(
        fieldCase_);
  }

  public static final int MESSAGEEVENT_FIELD_NUMBER = 1;
  /**
   * <code>.v1.PMessageEvent messageEvent = 1;</code>
   */
  public boolean hasMessageEvent() {
    return fieldCase_ == 1;
  }
  /**
   * <code>.v1.PMessageEvent messageEvent = 1;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PMessageEvent getMessageEvent() {
    if (fieldCase_ == 1) {
       return (com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_;
    }
    return com.navercorp.pinpoint.grpc.trace.PMessageEvent.getDefaultInstance();
  }
  /**
   * <code>.v1.PMessageEvent messageEvent = 1;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PMessageEventOrBuilder getMessageEventOrBuilder() {
    if (fieldCase_ == 1) {
       return (com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_;
    }
    return com.navercorp.pinpoint.grpc.trace.PMessageEvent.getDefaultInstance();
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
    if (fieldCase_ == 1) {
      output.writeMessage(1, (com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fieldCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_);
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
    if (!(obj instanceof com.navercorp.pinpoint.grpc.trace.PNextEvent)) {
      return super.equals(obj);
    }
    com.navercorp.pinpoint.grpc.trace.PNextEvent other = (com.navercorp.pinpoint.grpc.trace.PNextEvent) obj;

    boolean result = true;
    result = result && getFieldCase().equals(
        other.getFieldCase());
    if (!result) return false;
    switch (fieldCase_) {
      case 1:
        result = result && getMessageEvent()
            .equals(other.getMessageEvent());
        break;
      case 0:
      default:
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
    switch (fieldCase_) {
      case 1:
        hash = (37 * hash) + MESSAGEEVENT_FIELD_NUMBER;
        hash = (53 * hash) + getMessageEvent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PNextEvent parseFrom(
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
  public static Builder newBuilder(com.navercorp.pinpoint.grpc.trace.PNextEvent prototype) {
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
   * Protobuf type {@code v1.PNextEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v1.PNextEvent)
      com.navercorp.pinpoint.grpc.trace.PNextEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PNextEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PNextEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.navercorp.pinpoint.grpc.trace.PNextEvent.class, com.navercorp.pinpoint.grpc.trace.PNextEvent.Builder.class);
    }

    // Construct using com.navercorp.pinpoint.grpc.trace.PNextEvent.newBuilder()
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
      fieldCase_ = 0;
      field_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.navercorp.pinpoint.grpc.trace.SpanProto.internal_static_v1_PNextEvent_descriptor;
    }

    public com.navercorp.pinpoint.grpc.trace.PNextEvent getDefaultInstanceForType() {
      return com.navercorp.pinpoint.grpc.trace.PNextEvent.getDefaultInstance();
    }

    public com.navercorp.pinpoint.grpc.trace.PNextEvent build() {
      com.navercorp.pinpoint.grpc.trace.PNextEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.navercorp.pinpoint.grpc.trace.PNextEvent buildPartial() {
      com.navercorp.pinpoint.grpc.trace.PNextEvent result = new com.navercorp.pinpoint.grpc.trace.PNextEvent(this);
      if (fieldCase_ == 1) {
        if (messageEventBuilder_ == null) {
          result.field_ = field_;
        } else {
          result.field_ = messageEventBuilder_.build();
        }
      }
      result.fieldCase_ = fieldCase_;
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
      if (other instanceof com.navercorp.pinpoint.grpc.trace.PNextEvent) {
        return mergeFrom((com.navercorp.pinpoint.grpc.trace.PNextEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.navercorp.pinpoint.grpc.trace.PNextEvent other) {
      if (other == com.navercorp.pinpoint.grpc.trace.PNextEvent.getDefaultInstance()) return this;
      switch (other.getFieldCase()) {
        case MESSAGEEVENT: {
          mergeMessageEvent(other.getMessageEvent());
          break;
        }
        case FIELD_NOT_SET: {
          break;
        }
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
      com.navercorp.pinpoint.grpc.trace.PNextEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.navercorp.pinpoint.grpc.trace.PNextEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int fieldCase_ = 0;
    private java.lang.Object field_;
    public FieldCase
        getFieldCase() {
      return FieldCase.forNumber(
          fieldCase_);
    }

    public Builder clearField() {
      fieldCase_ = 0;
      field_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PMessageEvent, com.navercorp.pinpoint.grpc.trace.PMessageEvent.Builder, com.navercorp.pinpoint.grpc.trace.PMessageEventOrBuilder> messageEventBuilder_;
    /**
     * <code>.v1.PMessageEvent messageEvent = 1;</code>
     */
    public boolean hasMessageEvent() {
      return fieldCase_ == 1;
    }
    /**
     * <code>.v1.PMessageEvent messageEvent = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PMessageEvent getMessageEvent() {
      if (messageEventBuilder_ == null) {
        if (fieldCase_ == 1) {
          return (com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_;
        }
        return com.navercorp.pinpoint.grpc.trace.PMessageEvent.getDefaultInstance();
      } else {
        if (fieldCase_ == 1) {
          return messageEventBuilder_.getMessage();
        }
        return com.navercorp.pinpoint.grpc.trace.PMessageEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.v1.PMessageEvent messageEvent = 1;</code>
     */
    public Builder setMessageEvent(com.navercorp.pinpoint.grpc.trace.PMessageEvent value) {
      if (messageEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        field_ = value;
        onChanged();
      } else {
        messageEventBuilder_.setMessage(value);
      }
      fieldCase_ = 1;
      return this;
    }
    /**
     * <code>.v1.PMessageEvent messageEvent = 1;</code>
     */
    public Builder setMessageEvent(
        com.navercorp.pinpoint.grpc.trace.PMessageEvent.Builder builderForValue) {
      if (messageEventBuilder_ == null) {
        field_ = builderForValue.build();
        onChanged();
      } else {
        messageEventBuilder_.setMessage(builderForValue.build());
      }
      fieldCase_ = 1;
      return this;
    }
    /**
     * <code>.v1.PMessageEvent messageEvent = 1;</code>
     */
    public Builder mergeMessageEvent(com.navercorp.pinpoint.grpc.trace.PMessageEvent value) {
      if (messageEventBuilder_ == null) {
        if (fieldCase_ == 1 &&
            field_ != com.navercorp.pinpoint.grpc.trace.PMessageEvent.getDefaultInstance()) {
          field_ = com.navercorp.pinpoint.grpc.trace.PMessageEvent.newBuilder((com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_)
              .mergeFrom(value).buildPartial();
        } else {
          field_ = value;
        }
        onChanged();
      } else {
        if (fieldCase_ == 1) {
          messageEventBuilder_.mergeFrom(value);
        }
        messageEventBuilder_.setMessage(value);
      }
      fieldCase_ = 1;
      return this;
    }
    /**
     * <code>.v1.PMessageEvent messageEvent = 1;</code>
     */
    public Builder clearMessageEvent() {
      if (messageEventBuilder_ == null) {
        if (fieldCase_ == 1) {
          fieldCase_ = 0;
          field_ = null;
          onChanged();
        }
      } else {
        if (fieldCase_ == 1) {
          fieldCase_ = 0;
          field_ = null;
        }
        messageEventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.v1.PMessageEvent messageEvent = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PMessageEvent.Builder getMessageEventBuilder() {
      return getMessageEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.v1.PMessageEvent messageEvent = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PMessageEventOrBuilder getMessageEventOrBuilder() {
      if ((fieldCase_ == 1) && (messageEventBuilder_ != null)) {
        return messageEventBuilder_.getMessageOrBuilder();
      } else {
        if (fieldCase_ == 1) {
          return (com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_;
        }
        return com.navercorp.pinpoint.grpc.trace.PMessageEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.v1.PMessageEvent messageEvent = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PMessageEvent, com.navercorp.pinpoint.grpc.trace.PMessageEvent.Builder, com.navercorp.pinpoint.grpc.trace.PMessageEventOrBuilder> 
        getMessageEventFieldBuilder() {
      if (messageEventBuilder_ == null) {
        if (!(fieldCase_ == 1)) {
          field_ = com.navercorp.pinpoint.grpc.trace.PMessageEvent.getDefaultInstance();
        }
        messageEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.navercorp.pinpoint.grpc.trace.PMessageEvent, com.navercorp.pinpoint.grpc.trace.PMessageEvent.Builder, com.navercorp.pinpoint.grpc.trace.PMessageEventOrBuilder>(
                (com.navercorp.pinpoint.grpc.trace.PMessageEvent) field_,
                getParentForChildren(),
                isClean());
        field_ = null;
      }
      fieldCase_ = 1;
      onChanged();;
      return messageEventBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v1.PNextEvent)
  }

  // @@protoc_insertion_point(class_scope:v1.PNextEvent)
  private static final com.navercorp.pinpoint.grpc.trace.PNextEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.navercorp.pinpoint.grpc.trace.PNextEvent();
  }

  public static com.navercorp.pinpoint.grpc.trace.PNextEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PNextEvent>
      PARSER = new com.google.protobuf.AbstractParser<PNextEvent>() {
    public PNextEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PNextEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PNextEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PNextEvent> getParserForType() {
    return PARSER;
  }

  public com.navercorp.pinpoint.grpc.trace.PNextEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

