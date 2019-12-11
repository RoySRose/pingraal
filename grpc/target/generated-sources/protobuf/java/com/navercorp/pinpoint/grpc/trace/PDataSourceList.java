// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Stat.proto

package com.navercorp.pinpoint.grpc.trace;

/**
 * Protobuf type {@code v1.PDataSourceList}
 */
public  final class PDataSourceList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v1.PDataSourceList)
    PDataSourceListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PDataSourceList.newBuilder() to construct.
  private PDataSourceList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PDataSourceList() {
    dataSource_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PDataSourceList(
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
              dataSource_ = new java.util.ArrayList<com.navercorp.pinpoint.grpc.trace.PDataSource>();
              mutable_bitField0_ |= 0x00000001;
            }
            dataSource_.add(
                input.readMessage(com.navercorp.pinpoint.grpc.trace.PDataSource.parser(), extensionRegistry));
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
        dataSource_ = java.util.Collections.unmodifiableList(dataSource_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDataSourceList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDataSourceList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.navercorp.pinpoint.grpc.trace.PDataSourceList.class, com.navercorp.pinpoint.grpc.trace.PDataSourceList.Builder.class);
  }

  public static final int DATASOURCE_FIELD_NUMBER = 1;
  private java.util.List<com.navercorp.pinpoint.grpc.trace.PDataSource> dataSource_;
  /**
   * <code>repeated .v1.PDataSource dataSource = 1;</code>
   */
  public java.util.List<com.navercorp.pinpoint.grpc.trace.PDataSource> getDataSourceList() {
    return dataSource_;
  }
  /**
   * <code>repeated .v1.PDataSource dataSource = 1;</code>
   */
  public java.util.List<? extends com.navercorp.pinpoint.grpc.trace.PDataSourceOrBuilder> 
      getDataSourceOrBuilderList() {
    return dataSource_;
  }
  /**
   * <code>repeated .v1.PDataSource dataSource = 1;</code>
   */
  public int getDataSourceCount() {
    return dataSource_.size();
  }
  /**
   * <code>repeated .v1.PDataSource dataSource = 1;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PDataSource getDataSource(int index) {
    return dataSource_.get(index);
  }
  /**
   * <code>repeated .v1.PDataSource dataSource = 1;</code>
   */
  public com.navercorp.pinpoint.grpc.trace.PDataSourceOrBuilder getDataSourceOrBuilder(
      int index) {
    return dataSource_.get(index);
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
    for (int i = 0; i < dataSource_.size(); i++) {
      output.writeMessage(1, dataSource_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dataSource_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dataSource_.get(i));
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
    if (!(obj instanceof com.navercorp.pinpoint.grpc.trace.PDataSourceList)) {
      return super.equals(obj);
    }
    com.navercorp.pinpoint.grpc.trace.PDataSourceList other = (com.navercorp.pinpoint.grpc.trace.PDataSourceList) obj;

    boolean result = true;
    result = result && getDataSourceList()
        .equals(other.getDataSourceList());
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
    if (getDataSourceCount() > 0) {
      hash = (37 * hash) + DATASOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getDataSourceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList parseFrom(
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
  public static Builder newBuilder(com.navercorp.pinpoint.grpc.trace.PDataSourceList prototype) {
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
   * Protobuf type {@code v1.PDataSourceList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v1.PDataSourceList)
      com.navercorp.pinpoint.grpc.trace.PDataSourceListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDataSourceList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDataSourceList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.navercorp.pinpoint.grpc.trace.PDataSourceList.class, com.navercorp.pinpoint.grpc.trace.PDataSourceList.Builder.class);
    }

    // Construct using com.navercorp.pinpoint.grpc.trace.PDataSourceList.newBuilder()
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
        getDataSourceFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (dataSourceBuilder_ == null) {
        dataSource_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataSourceBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PDataSourceList_descriptor;
    }

    public com.navercorp.pinpoint.grpc.trace.PDataSourceList getDefaultInstanceForType() {
      return com.navercorp.pinpoint.grpc.trace.PDataSourceList.getDefaultInstance();
    }

    public com.navercorp.pinpoint.grpc.trace.PDataSourceList build() {
      com.navercorp.pinpoint.grpc.trace.PDataSourceList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.navercorp.pinpoint.grpc.trace.PDataSourceList buildPartial() {
      com.navercorp.pinpoint.grpc.trace.PDataSourceList result = new com.navercorp.pinpoint.grpc.trace.PDataSourceList(this);
      int from_bitField0_ = bitField0_;
      if (dataSourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          dataSource_ = java.util.Collections.unmodifiableList(dataSource_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataSource_ = dataSource_;
      } else {
        result.dataSource_ = dataSourceBuilder_.build();
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
      if (other instanceof com.navercorp.pinpoint.grpc.trace.PDataSourceList) {
        return mergeFrom((com.navercorp.pinpoint.grpc.trace.PDataSourceList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.navercorp.pinpoint.grpc.trace.PDataSourceList other) {
      if (other == com.navercorp.pinpoint.grpc.trace.PDataSourceList.getDefaultInstance()) return this;
      if (dataSourceBuilder_ == null) {
        if (!other.dataSource_.isEmpty()) {
          if (dataSource_.isEmpty()) {
            dataSource_ = other.dataSource_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataSourceIsMutable();
            dataSource_.addAll(other.dataSource_);
          }
          onChanged();
        }
      } else {
        if (!other.dataSource_.isEmpty()) {
          if (dataSourceBuilder_.isEmpty()) {
            dataSourceBuilder_.dispose();
            dataSourceBuilder_ = null;
            dataSource_ = other.dataSource_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataSourceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataSourceFieldBuilder() : null;
          } else {
            dataSourceBuilder_.addAllMessages(other.dataSource_);
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
      com.navercorp.pinpoint.grpc.trace.PDataSourceList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.navercorp.pinpoint.grpc.trace.PDataSourceList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.navercorp.pinpoint.grpc.trace.PDataSource> dataSource_ =
      java.util.Collections.emptyList();
    private void ensureDataSourceIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        dataSource_ = new java.util.ArrayList<com.navercorp.pinpoint.grpc.trace.PDataSource>(dataSource_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PDataSource, com.navercorp.pinpoint.grpc.trace.PDataSource.Builder, com.navercorp.pinpoint.grpc.trace.PDataSourceOrBuilder> dataSourceBuilder_;

    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public java.util.List<com.navercorp.pinpoint.grpc.trace.PDataSource> getDataSourceList() {
      if (dataSourceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataSource_);
      } else {
        return dataSourceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public int getDataSourceCount() {
      if (dataSourceBuilder_ == null) {
        return dataSource_.size();
      } else {
        return dataSourceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PDataSource getDataSource(int index) {
      if (dataSourceBuilder_ == null) {
        return dataSource_.get(index);
      } else {
        return dataSourceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public Builder setDataSource(
        int index, com.navercorp.pinpoint.grpc.trace.PDataSource value) {
      if (dataSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSourceIsMutable();
        dataSource_.set(index, value);
        onChanged();
      } else {
        dataSourceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public Builder setDataSource(
        int index, com.navercorp.pinpoint.grpc.trace.PDataSource.Builder builderForValue) {
      if (dataSourceBuilder_ == null) {
        ensureDataSourceIsMutable();
        dataSource_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataSourceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public Builder addDataSource(com.navercorp.pinpoint.grpc.trace.PDataSource value) {
      if (dataSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSourceIsMutable();
        dataSource_.add(value);
        onChanged();
      } else {
        dataSourceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public Builder addDataSource(
        int index, com.navercorp.pinpoint.grpc.trace.PDataSource value) {
      if (dataSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSourceIsMutable();
        dataSource_.add(index, value);
        onChanged();
      } else {
        dataSourceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public Builder addDataSource(
        com.navercorp.pinpoint.grpc.trace.PDataSource.Builder builderForValue) {
      if (dataSourceBuilder_ == null) {
        ensureDataSourceIsMutable();
        dataSource_.add(builderForValue.build());
        onChanged();
      } else {
        dataSourceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public Builder addDataSource(
        int index, com.navercorp.pinpoint.grpc.trace.PDataSource.Builder builderForValue) {
      if (dataSourceBuilder_ == null) {
        ensureDataSourceIsMutable();
        dataSource_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataSourceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public Builder addAllDataSource(
        java.lang.Iterable<? extends com.navercorp.pinpoint.grpc.trace.PDataSource> values) {
      if (dataSourceBuilder_ == null) {
        ensureDataSourceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dataSource_);
        onChanged();
      } else {
        dataSourceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public Builder clearDataSource() {
      if (dataSourceBuilder_ == null) {
        dataSource_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataSourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public Builder removeDataSource(int index) {
      if (dataSourceBuilder_ == null) {
        ensureDataSourceIsMutable();
        dataSource_.remove(index);
        onChanged();
      } else {
        dataSourceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PDataSource.Builder getDataSourceBuilder(
        int index) {
      return getDataSourceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PDataSourceOrBuilder getDataSourceOrBuilder(
        int index) {
      if (dataSourceBuilder_ == null) {
        return dataSource_.get(index);  } else {
        return dataSourceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public java.util.List<? extends com.navercorp.pinpoint.grpc.trace.PDataSourceOrBuilder> 
         getDataSourceOrBuilderList() {
      if (dataSourceBuilder_ != null) {
        return dataSourceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataSource_);
      }
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PDataSource.Builder addDataSourceBuilder() {
      return getDataSourceFieldBuilder().addBuilder(
          com.navercorp.pinpoint.grpc.trace.PDataSource.getDefaultInstance());
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public com.navercorp.pinpoint.grpc.trace.PDataSource.Builder addDataSourceBuilder(
        int index) {
      return getDataSourceFieldBuilder().addBuilder(
          index, com.navercorp.pinpoint.grpc.trace.PDataSource.getDefaultInstance());
    }
    /**
     * <code>repeated .v1.PDataSource dataSource = 1;</code>
     */
    public java.util.List<com.navercorp.pinpoint.grpc.trace.PDataSource.Builder> 
         getDataSourceBuilderList() {
      return getDataSourceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.navercorp.pinpoint.grpc.trace.PDataSource, com.navercorp.pinpoint.grpc.trace.PDataSource.Builder, com.navercorp.pinpoint.grpc.trace.PDataSourceOrBuilder> 
        getDataSourceFieldBuilder() {
      if (dataSourceBuilder_ == null) {
        dataSourceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.navercorp.pinpoint.grpc.trace.PDataSource, com.navercorp.pinpoint.grpc.trace.PDataSource.Builder, com.navercorp.pinpoint.grpc.trace.PDataSourceOrBuilder>(
                dataSource_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        dataSource_ = null;
      }
      return dataSourceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v1.PDataSourceList)
  }

  // @@protoc_insertion_point(class_scope:v1.PDataSourceList)
  private static final com.navercorp.pinpoint.grpc.trace.PDataSourceList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.navercorp.pinpoint.grpc.trace.PDataSourceList();
  }

  public static com.navercorp.pinpoint.grpc.trace.PDataSourceList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PDataSourceList>
      PARSER = new com.google.protobuf.AbstractParser<PDataSourceList>() {
    public PDataSourceList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PDataSourceList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PDataSourceList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PDataSourceList> getParserForType() {
    return PARSER;
  }

  public com.navercorp.pinpoint.grpc.trace.PDataSourceList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
