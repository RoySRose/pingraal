// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Stat.proto

package com.navercorp.pinpoint.grpc.trace;

/**
 * Protobuf type {@code v1.PDeadlock}
 */
public  final class PDeadlock extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v1.PDeadlock)
    PDeadlockOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PDeadlock.newBuilder() to construct.
  private PDeadlock(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PDeadlock() {
    count_ = 0;
    threadDump_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PDeadlock(
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

            count_ = input.readInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              threadDump_ = new java.util.ArrayList<com.navercorp.pinpoint.grpc.trace.PThreadDump>();
              mutable_bitField0_ |= 0x00000002;
            }
            threadDump_.add(
                input.readMessage(com.navercorp.pinpoint.grpc.trace.PThreadDump.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        threadDump_ = java.util.Collections.unmodifiableList(threadDump_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDeadlock_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDeadlock_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.navercorp.pinpoint.grpc.trace.PDeadlock.class, com.navercorp.pinpoint.grpc.trace.PDeadlock.Builder.class);
  }

  private int bitField0_;
  public static final int COUNT_FIELD_NUMBER = 1;
  private int count_;
  /**
   * <code>int32 count = 1;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int THREADDUMP_FIELD_NUMBER = 2;
  private java.util.List<com.navercorp.pinpoint.grpc.trace.PThreadDump> threadDump_;
  /**
   * <code>repeated .v1.PThreadDump threadDump = 2;</code>
   */
  public java.util.List<com.navercorp.pinpoint.grpc.trace.PThreadDump> getThreadDumpList() {
    return threadDump_;
  }
  /**
   * <code>repeated .v1.PThreadDump threadDump = 2;</code>
   */
  public java.util.List<? extends com.navercorp.pinpoint.grpc.trace.PThreadDumpOrBuilder> 
      getThreadDumpOrBuilderList() {
    return threadDump_;
  }
  /**
   * <code>repeated .v1.PThreadDump threadDump = 2;</code>
   */
  public int getThreadDumpCount() {
    return threadDump_.size();
  }
  /**
   * <code>repeated .v1.PThreadDump threadDump = 2;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PThreadDump getThreadDump(int index) {
    return threadDump_.get(index);
  }
  /**
   * <code>repeated .v1.PThreadDump threadDump = 2;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PThreadDumpOrBuilder getThreadDumpOrBuilder(
      int index) {
    return threadDump_.get(index);
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
    if (count_ != 0) {
      output.writeInt32(1, count_);
    }
    for (int i = 0; i < threadDump_.size(); i++) {
      output.writeMessage(2, threadDump_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, count_);
    }
    for (int i = 0; i < threadDump_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, threadDump_.get(i));
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
    if (!(obj instanceof com.navercorp.pinpoint.grpc.trace.PDeadlock)) {
      return super.equals(obj);
    }
    com.navercorp.pinpoint.grpc.trace.PDeadlock other = (com.navercorp.pinpoint.grpc.trace.PDeadlock) obj;

    boolean result = true;
    result = result && (getCount()
        == other.getCount());
    result = result && getThreadDumpList()
        .equals(other.getThreadDumpList());
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
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (getThreadDumpCount() > 0) {
      hash = (37 * hash) + THREADDUMP_FIELD_NUMBER;
      hash = (53 * hash) + getThreadDumpList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDeadlock parseFrom(
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
  public static Builder newBuilder(com.navercorp.pinpoint.grpc.trace.PDeadlock prototype) {
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
   * Protobuf type {@code v1.PDeadlock}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v1.PDeadlock)
      com.navercorp.pinpoint.grpc.trace.PDeadlockOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDeadlock_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDeadlock_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.navercorp.pinpoint.grpc.trace.PDeadlock.class, com.navercorp.pinpoint.grpc.trace.PDeadlock.Builder.class);
    }

    // Construct using com.navercorp.pinpoint.grpc.trace.PDeadlock.newBuilder()
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
        getThreadDumpFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      count_ = 0;

      if (threadDumpBuilder_ == null) {
        threadDump_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        threadDumpBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDeadlock_descriptor;
    }

    public com.navercorp.pinpoint.grpc.trace.PDeadlock getDefaultInstanceForType() {
      return com.navercorp.pinpoint.grpc.trace.PDeadlock.getDefaultInstance();
    }

    public com.navercorp.pinpoint.grpc.trace.PDeadlock build() {
      com.navercorp.pinpoint.grpc.trace.PDeadlock result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.navercorp.pinpoint.grpc.trace.PDeadlock buildPartial() {
      com.navercorp.pinpoint.grpc.trace.PDeadlock result = new com.navercorp.pinpoint.grpc.trace.PDeadlock(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.count_ = count_;
      if (threadDumpBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          threadDump_ = java.util.Collections.unmodifiableList(threadDump_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.threadDump_ = threadDump_;
      } else {
        result.threadDump_ = threadDumpBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.navercorp.pinpoint.grpc.trace.PDeadlock) {
        return mergeFrom((com.navercorp.pinpoint.grpc.trace.PDeadlock)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.navercorp.pinpoint.grpc.trace.PDeadlock other) {
      if (other == com.navercorp.pinpoint.grpc.trace.PDeadlock.getDefaultInstance()) return this;
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (threadDumpBuilder_ == null) {
        if (!other.threadDump_.isEmpty()) {
          if (threadDump_.isEmpty()) {
            threadDump_ = other.threadDump_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureThreadDumpIsMutable();
            threadDump_.addAll(other.threadDump_);
          }
          onChanged();
        }
      } else {
        if (!other.threadDump_.isEmpty()) {
          if (threadDumpBuilder_.isEmpty()) {
            threadDumpBuilder_.dispose();
            threadDumpBuilder_ = null;
            threadDump_ = other.threadDump_;
            bitField0_ = (bitField0_ & ~0x00000002);
            threadDumpBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getThreadDumpFieldBuilder() : null;
          } else {
            threadDumpBuilder_.addAllMessages(other.threadDump_);
          }
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
      com.navercorp.pinpoint.grpc.trace.PDeadlock parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.navercorp.pinpoint.grpc.trace.PDeadlock) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int count_ ;
    /**
     * <code>int32 count = 1;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 1;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 1;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.navercorp.pinpoint.grpc.trace.PThreadDump> threadDump_ =
      java.util.Collections.emptyList();
    private void ensureThreadDumpIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        threadDump_ = new java.util.ArrayList<com.navercorp.pinpoint.grpc.trace.PThreadDump>(threadDump_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PThreadDump, com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder, com.navercorp.pinpoint.grpc.trace.PThreadDumpOrBuilder> threadDumpBuilder_;

    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public java.util.List<com.navercorp.pinpoint.grpc.trace.PThreadDump> getThreadDumpList() {
      if (threadDumpBuilder_ == null) {
        return java.util.Collections.unmodifiableList(threadDump_);
      } else {
        return threadDumpBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public int getThreadDumpCount() {
      if (threadDumpBuilder_ == null) {
        return threadDump_.size();
      } else {
        return threadDumpBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PThreadDump getThreadDump(int index) {
      if (threadDumpBuilder_ == null) {
        return threadDump_.get(index);
      } else {
        return threadDumpBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public Builder setThreadDump(
        int index, com.navercorp.pinpoint.grpc.trace.PThreadDump value) {
      if (threadDumpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThreadDumpIsMutable();
        threadDump_.set(index, value);
        onChanged();
      } else {
        threadDumpBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public Builder setThreadDump(
        int index, com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder builderForValue) {
      if (threadDumpBuilder_ == null) {
        ensureThreadDumpIsMutable();
        threadDump_.set(index, builderForValue.build());
        onChanged();
      } else {
        threadDumpBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public Builder addThreadDump(com.navercorp.pinpoint.grpc.trace.PThreadDump value) {
      if (threadDumpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThreadDumpIsMutable();
        threadDump_.add(value);
        onChanged();
      } else {
        threadDumpBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public Builder addThreadDump(
        int index, com.navercorp.pinpoint.grpc.trace.PThreadDump value) {
      if (threadDumpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThreadDumpIsMutable();
        threadDump_.add(index, value);
        onChanged();
      } else {
        threadDumpBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public Builder addThreadDump(
        com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder builderForValue) {
      if (threadDumpBuilder_ == null) {
        ensureThreadDumpIsMutable();
        threadDump_.add(builderForValue.build());
        onChanged();
      } else {
        threadDumpBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public Builder addThreadDump(
        int index, com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder builderForValue) {
      if (threadDumpBuilder_ == null) {
        ensureThreadDumpIsMutable();
        threadDump_.add(index, builderForValue.build());
        onChanged();
      } else {
        threadDumpBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public Builder addAllThreadDump(
        java.lang.Iterable<? extends com.navercorp.pinpoint.grpc.trace.PThreadDump> values) {
      if (threadDumpBuilder_ == null) {
        ensureThreadDumpIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, threadDump_);
        onChanged();
      } else {
        threadDumpBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public Builder clearThreadDump() {
      if (threadDumpBuilder_ == null) {
        threadDump_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        threadDumpBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public Builder removeThreadDump(int index) {
      if (threadDumpBuilder_ == null) {
        ensureThreadDumpIsMutable();
        threadDump_.remove(index);
        onChanged();
      } else {
        threadDumpBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder getThreadDumpBuilder(
        int index) {
      return getThreadDumpFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PThreadDumpOrBuilder getThreadDumpOrBuilder(
        int index) {
      if (threadDumpBuilder_ == null) {
        return threadDump_.get(index);  } else {
        return threadDumpBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public java.util.List<? extends com.navercorp.pinpoint.grpc.trace.PThreadDumpOrBuilder> 
         getThreadDumpOrBuilderList() {
      if (threadDumpBuilder_ != null) {
        return threadDumpBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(threadDump_);
      }
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder addThreadDumpBuilder() {
      return getThreadDumpFieldBuilder().addBuilder(
          com.navercorp.pinpoint.grpc.trace.PThreadDump.getDefaultInstance());
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder addThreadDumpBuilder(
        int index) {
      return getThreadDumpFieldBuilder().addBuilder(
          index, com.navercorp.pinpoint.grpc.trace.PThreadDump.getDefaultInstance());
    }
    /**
     * <code>repeated .v1.PThreadDump threadDump = 2;</code>
     */
    public java.util.List<com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder> 
         getThreadDumpBuilderList() {
      return getThreadDumpFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PThreadDump, com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder, com.navercorp.pinpoint.grpc.trace.PThreadDumpOrBuilder> 
        getThreadDumpFieldBuilder() {
      if (threadDumpBuilder_ == null) {
        threadDumpBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.navercorp.pinpoint.grpc.trace.PThreadDump, com.navercorp.pinpoint.grpc.trace.PThreadDump.Builder, com.navercorp.pinpoint.grpc.trace.PThreadDumpOrBuilder>(
                threadDump_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        threadDump_ = null;
      }
      return threadDumpBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v1.PDeadlock)
  }

  // @@protoc_insertion_point(class_scope:v1.PDeadlock)
  private static final com.navercorp.pinpoint.grpc.trace.PDeadlock DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.navercorp.pinpoint.grpc.trace.PDeadlock();
  }

  public static com.navercorp.pinpoint.grpc.trace.PDeadlock getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PDeadlock>
      PARSER = new com.google.protobuf.AbstractParser<PDeadlock>() {
    public PDeadlock parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PDeadlock(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PDeadlock> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PDeadlock> getParserForType() {
    return PARSER;
  }

  public com.navercorp.pinpoint.grpc.trace.PDeadlock getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
