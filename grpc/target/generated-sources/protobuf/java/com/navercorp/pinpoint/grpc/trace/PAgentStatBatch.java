// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Stat.proto

package com.navercorp.pinpoint.grpc.trace;

/**
 * Protobuf type {@code v1.PAgentStatBatch}
 */
public  final class PAgentStatBatch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v1.PAgentStatBatch)
    PAgentStatBatchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PAgentStatBatch.newBuilder() to construct.
  private PAgentStatBatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PAgentStatBatch() {
    agentStat_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PAgentStatBatch(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              agentStat_ = new java.util.ArrayList<com.navercorp.pinpoint.grpc.trace.PAgentStat>();
              mutable_bitField0_ |= 0x00000001;
            }
            agentStat_.add(
                input.readMessage(com.navercorp.pinpoint.grpc.trace.PAgentStat.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        agentStat_ = java.util.Collections.unmodifiableList(agentStat_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PAgentStatBatch_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PAgentStatBatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.navercorp.pinpoint.grpc.trace.PAgentStatBatch.class, com.navercorp.pinpoint.grpc.trace.PAgentStatBatch.Builder.class);
  }

  public static final int AGENTSTAT_FIELD_NUMBER = 1;
  private java.util.List<com.navercorp.pinpoint.grpc.trace.PAgentStat> agentStat_;
  /**
   * <code>repeated .v1.PAgentStat agentStat = 1;</code>
   */
  public java.util.List<com.navercorp.pinpoint.grpc.trace.PAgentStat> getAgentStatList() {
    return agentStat_;
  }
  /**
   * <code>repeated .v1.PAgentStat agentStat = 1;</code>
   */
  public java.util.List<? extends com.navercorp.pinpoint.grpc.trace.PAgentStatOrBuilder> 
      getAgentStatOrBuilderList() {
    return agentStat_;
  }
  /**
   * <code>repeated .v1.PAgentStat agentStat = 1;</code>
   */
  public int getAgentStatCount() {
    return agentStat_.size();
  }
  /**
   * <code>repeated .v1.PAgentStat agentStat = 1;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PAgentStat getAgentStat(int index) {
    return agentStat_.get(index);
  }
  /**
   * <code>repeated .v1.PAgentStat agentStat = 1;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PAgentStatOrBuilder getAgentStatOrBuilder(
      int index) {
    return agentStat_.get(index);
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
    for (int i = 0; i < agentStat_.size(); i++) {
      output.writeMessage(1, agentStat_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < agentStat_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, agentStat_.get(i));
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
    if (!(obj instanceof com.navercorp.pinpoint.grpc.trace.PAgentStatBatch)) {
      return super.equals(obj);
    }
    com.navercorp.pinpoint.grpc.trace.PAgentStatBatch other = (com.navercorp.pinpoint.grpc.trace.PAgentStatBatch) obj;

    boolean result = true;
    result = result && getAgentStatList()
        .equals(other.getAgentStatList());
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
    if (getAgentStatCount() > 0) {
      hash = (37 * hash) + AGENTSTAT_FIELD_NUMBER;
      hash = (53 * hash) + getAgentStatList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parseFrom(
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
  public static Builder newBuilder(com.navercorp.pinpoint.grpc.trace.PAgentStatBatch prototype) {
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
   * Protobuf type {@code v1.PAgentStatBatch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v1.PAgentStatBatch)
      com.navercorp.pinpoint.grpc.trace.PAgentStatBatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PAgentStatBatch_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PAgentStatBatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.navercorp.pinpoint.grpc.trace.PAgentStatBatch.class, com.navercorp.pinpoint.grpc.trace.PAgentStatBatch.Builder.class);
    }

    // Construct using com.navercorp.pinpoint.grpc.trace.PAgentStatBatch.newBuilder()
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
        getAgentStatFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (agentStatBuilder_ == null) {
        agentStat_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        agentStatBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PAgentStatBatch_descriptor;
    }

    public com.navercorp.pinpoint.grpc.trace.PAgentStatBatch getDefaultInstanceForType() {
      return com.navercorp.pinpoint.grpc.trace.PAgentStatBatch.getDefaultInstance();
    }

    public com.navercorp.pinpoint.grpc.trace.PAgentStatBatch build() {
      com.navercorp.pinpoint.grpc.trace.PAgentStatBatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.navercorp.pinpoint.grpc.trace.PAgentStatBatch buildPartial() {
      com.navercorp.pinpoint.grpc.trace.PAgentStatBatch result = new com.navercorp.pinpoint.grpc.trace.PAgentStatBatch(this);
      int from_bitField0_ = bitField0_;
      if (agentStatBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          agentStat_ = java.util.Collections.unmodifiableList(agentStat_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.agentStat_ = agentStat_;
      } else {
        result.agentStat_ = agentStatBuilder_.build();
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
      if (other instanceof com.navercorp.pinpoint.grpc.trace.PAgentStatBatch) {
        return mergeFrom((com.navercorp.pinpoint.grpc.trace.PAgentStatBatch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.navercorp.pinpoint.grpc.trace.PAgentStatBatch other) {
      if (other == com.navercorp.pinpoint.grpc.trace.PAgentStatBatch.getDefaultInstance()) return this;
      if (agentStatBuilder_ == null) {
        if (!other.agentStat_.isEmpty()) {
          if (agentStat_.isEmpty()) {
            agentStat_ = other.agentStat_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgentStatIsMutable();
            agentStat_.addAll(other.agentStat_);
          }
          onChanged();
        }
      } else {
        if (!other.agentStat_.isEmpty()) {
          if (agentStatBuilder_.isEmpty()) {
            agentStatBuilder_.dispose();
            agentStatBuilder_ = null;
            agentStat_ = other.agentStat_;
            bitField0_ = (bitField0_ & ~0x00000001);
            agentStatBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgentStatFieldBuilder() : null;
          } else {
            agentStatBuilder_.addAllMessages(other.agentStat_);
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
      com.navercorp.pinpoint.grpc.trace.PAgentStatBatch parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.navercorp.pinpoint.grpc.trace.PAgentStatBatch) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.navercorp.pinpoint.grpc.trace.PAgentStat> agentStat_ =
      java.util.Collections.emptyList();
    private void ensureAgentStatIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        agentStat_ = new java.util.ArrayList<com.navercorp.pinpoint.grpc.trace.PAgentStat>(agentStat_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PAgentStat, com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder, com.navercorp.pinpoint.grpc.trace.PAgentStatOrBuilder> agentStatBuilder_;

    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public java.util.List<com.navercorp.pinpoint.grpc.trace.PAgentStat> getAgentStatList() {
      if (agentStatBuilder_ == null) {
        return java.util.Collections.unmodifiableList(agentStat_);
      } else {
        return agentStatBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public int getAgentStatCount() {
      if (agentStatBuilder_ == null) {
        return agentStat_.size();
      } else {
        return agentStatBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PAgentStat getAgentStat(int index) {
      if (agentStatBuilder_ == null) {
        return agentStat_.get(index);
      } else {
        return agentStatBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public Builder setAgentStat(
        int index, com.navercorp.pinpoint.grpc.trace.PAgentStat value) {
      if (agentStatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentStatIsMutable();
        agentStat_.set(index, value);
        onChanged();
      } else {
        agentStatBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public Builder setAgentStat(
        int index, com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder builderForValue) {
      if (agentStatBuilder_ == null) {
        ensureAgentStatIsMutable();
        agentStat_.set(index, builderForValue.build());
        onChanged();
      } else {
        agentStatBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public Builder addAgentStat(com.navercorp.pinpoint.grpc.trace.PAgentStat value) {
      if (agentStatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentStatIsMutable();
        agentStat_.add(value);
        onChanged();
      } else {
        agentStatBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public Builder addAgentStat(
        int index, com.navercorp.pinpoint.grpc.trace.PAgentStat value) {
      if (agentStatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentStatIsMutable();
        agentStat_.add(index, value);
        onChanged();
      } else {
        agentStatBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public Builder addAgentStat(
        com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder builderForValue) {
      if (agentStatBuilder_ == null) {
        ensureAgentStatIsMutable();
        agentStat_.add(builderForValue.build());
        onChanged();
      } else {
        agentStatBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public Builder addAgentStat(
        int index, com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder builderForValue) {
      if (agentStatBuilder_ == null) {
        ensureAgentStatIsMutable();
        agentStat_.add(index, builderForValue.build());
        onChanged();
      } else {
        agentStatBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public Builder addAllAgentStat(
        java.lang.Iterable<? extends com.navercorp.pinpoint.grpc.trace.PAgentStat> values) {
      if (agentStatBuilder_ == null) {
        ensureAgentStatIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, agentStat_);
        onChanged();
      } else {
        agentStatBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public Builder clearAgentStat() {
      if (agentStatBuilder_ == null) {
        agentStat_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        agentStatBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public Builder removeAgentStat(int index) {
      if (agentStatBuilder_ == null) {
        ensureAgentStatIsMutable();
        agentStat_.remove(index);
        onChanged();
      } else {
        agentStatBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder getAgentStatBuilder(
        int index) {
      return getAgentStatFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PAgentStatOrBuilder getAgentStatOrBuilder(
        int index) {
      if (agentStatBuilder_ == null) {
        return agentStat_.get(index);  } else {
        return agentStatBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public java.util.List<? extends com.navercorp.pinpoint.grpc.trace.PAgentStatOrBuilder> 
         getAgentStatOrBuilderList() {
      if (agentStatBuilder_ != null) {
        return agentStatBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(agentStat_);
      }
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder addAgentStatBuilder() {
      return getAgentStatFieldBuilder().addBuilder(
          com.navercorp.pinpoint.grpc.trace.PAgentStat.getDefaultInstance());
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder addAgentStatBuilder(
        int index) {
      return getAgentStatFieldBuilder().addBuilder(
          index, com.navercorp.pinpoint.grpc.trace.PAgentStat.getDefaultInstance());
    }
    /**
     * <code>repeated .v1.PAgentStat agentStat = 1;</code>
     */
    public java.util.List<com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder> 
         getAgentStatBuilderList() {
      return getAgentStatFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PAgentStat, com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder, com.navercorp.pinpoint.grpc.trace.PAgentStatOrBuilder> 
        getAgentStatFieldBuilder() {
      if (agentStatBuilder_ == null) {
        agentStatBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.navercorp.pinpoint.grpc.trace.PAgentStat, com.navercorp.pinpoint.grpc.trace.PAgentStat.Builder, com.navercorp.pinpoint.grpc.trace.PAgentStatOrBuilder>(
                agentStat_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        agentStat_ = null;
      }
      return agentStatBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v1.PAgentStatBatch)
  }

  // @@protoc_insertion_point(class_scope:v1.PAgentStatBatch)
  private static final com.navercorp.pinpoint.grpc.trace.PAgentStatBatch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.navercorp.pinpoint.grpc.trace.PAgentStatBatch();
  }

  public static com.navercorp.pinpoint.grpc.trace.PAgentStatBatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PAgentStatBatch>
      PARSER = new com.google.protobuf.AbstractParser<PAgentStatBatch>() {
    public PAgentStatBatch parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PAgentStatBatch(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PAgentStatBatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PAgentStatBatch> getParserForType() {
    return PARSER;
  }

  public com.navercorp.pinpoint.grpc.trace.PAgentStatBatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

