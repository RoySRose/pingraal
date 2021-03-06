// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Stat.proto

package com.navercorp.pinpoint.grpc.trace;

/**
 * Protobuf type {@code v1.PCpuLoad}
 */
public  final class PCpuLoad extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v1.PCpuLoad)
    PCpuLoadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PCpuLoad.newBuilder() to construct.
  private PCpuLoad(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PCpuLoad() {
    jvmCpuLoad_ = 0D;
    systemCpuLoad_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PCpuLoad(
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
          case 9: {

            jvmCpuLoad_ = input.readDouble();
            break;
          }
          case 17: {

            systemCpuLoad_ = input.readDouble();
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
    return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PCpuLoad_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PCpuLoad_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.navercorp.pinpoint.grpc.trace.PCpuLoad.class, com.navercorp.pinpoint.grpc.trace.PCpuLoad.Builder.class);
  }

  public static final int JVMCPULOAD_FIELD_NUMBER = 1;
  private double jvmCpuLoad_;
  /**
   * <code>double jvmCpuLoad = 1;</code>
   */
  public double getJvmCpuLoad() {
    return jvmCpuLoad_;
  }

  public static final int SYSTEMCPULOAD_FIELD_NUMBER = 2;
  private double systemCpuLoad_;
  /**
   * <code>double systemCpuLoad = 2;</code>
   */
  public double getSystemCpuLoad() {
    return systemCpuLoad_;
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
    if (jvmCpuLoad_ != 0D) {
      output.writeDouble(1, jvmCpuLoad_);
    }
    if (systemCpuLoad_ != 0D) {
      output.writeDouble(2, systemCpuLoad_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jvmCpuLoad_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, jvmCpuLoad_);
    }
    if (systemCpuLoad_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, systemCpuLoad_);
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
    if (!(obj instanceof com.navercorp.pinpoint.grpc.trace.PCpuLoad)) {
      return super.equals(obj);
    }
    com.navercorp.pinpoint.grpc.trace.PCpuLoad other = (com.navercorp.pinpoint.grpc.trace.PCpuLoad) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getJvmCpuLoad())
        == java.lang.Double.doubleToLongBits(
            other.getJvmCpuLoad()));
    result = result && (
        java.lang.Double.doubleToLongBits(getSystemCpuLoad())
        == java.lang.Double.doubleToLongBits(
            other.getSystemCpuLoad()));
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
    hash = (37 * hash) + JVMCPULOAD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getJvmCpuLoad()));
    hash = (37 * hash) + SYSTEMCPULOAD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSystemCpuLoad()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad parseFrom(
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
  public static Builder newBuilder(com.navercorp.pinpoint.grpc.trace.PCpuLoad prototype) {
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
   * Protobuf type {@code v1.PCpuLoad}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v1.PCpuLoad)
      com.navercorp.pinpoint.grpc.trace.PCpuLoadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PCpuLoad_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PCpuLoad_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.navercorp.pinpoint.grpc.trace.PCpuLoad.class, com.navercorp.pinpoint.grpc.trace.PCpuLoad.Builder.class);
    }

    // Construct using com.navercorp.pinpoint.grpc.trace.PCpuLoad.newBuilder()
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
      jvmCpuLoad_ = 0D;

      systemCpuLoad_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.navercorp.pinpoint.grpc.trace.StatProto.internal_static_v1_PCpuLoad_descriptor;
    }

    public com.navercorp.pinpoint.grpc.trace.PCpuLoad getDefaultInstanceForType() {
      return com.navercorp.pinpoint.grpc.trace.PCpuLoad.getDefaultInstance();
    }

    public com.navercorp.pinpoint.grpc.trace.PCpuLoad build() {
      com.navercorp.pinpoint.grpc.trace.PCpuLoad result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.navercorp.pinpoint.grpc.trace.PCpuLoad buildPartial() {
      com.navercorp.pinpoint.grpc.trace.PCpuLoad result = new com.navercorp.pinpoint.grpc.trace.PCpuLoad(this);
      result.jvmCpuLoad_ = jvmCpuLoad_;
      result.systemCpuLoad_ = systemCpuLoad_;
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
      if (other instanceof com.navercorp.pinpoint.grpc.trace.PCpuLoad) {
        return mergeFrom((com.navercorp.pinpoint.grpc.trace.PCpuLoad)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.navercorp.pinpoint.grpc.trace.PCpuLoad other) {
      if (other == com.navercorp.pinpoint.grpc.trace.PCpuLoad.getDefaultInstance()) return this;
      if (other.getJvmCpuLoad() != 0D) {
        setJvmCpuLoad(other.getJvmCpuLoad());
      }
      if (other.getSystemCpuLoad() != 0D) {
        setSystemCpuLoad(other.getSystemCpuLoad());
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
      com.navercorp.pinpoint.grpc.trace.PCpuLoad parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.navercorp.pinpoint.grpc.trace.PCpuLoad) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double jvmCpuLoad_ ;
    /**
     * <code>double jvmCpuLoad = 1;</code>
     */
    public double getJvmCpuLoad() {
      return jvmCpuLoad_;
    }
    /**
     * <code>double jvmCpuLoad = 1;</code>
     */
    public Builder setJvmCpuLoad(double value) {
      
      jvmCpuLoad_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double jvmCpuLoad = 1;</code>
     */
    public Builder clearJvmCpuLoad() {
      
      jvmCpuLoad_ = 0D;
      onChanged();
      return this;
    }

    private double systemCpuLoad_ ;
    /**
     * <code>double systemCpuLoad = 2;</code>
     */
    public double getSystemCpuLoad() {
      return systemCpuLoad_;
    }
    /**
     * <code>double systemCpuLoad = 2;</code>
     */
    public Builder setSystemCpuLoad(double value) {
      
      systemCpuLoad_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double systemCpuLoad = 2;</code>
     */
    public Builder clearSystemCpuLoad() {
      
      systemCpuLoad_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:v1.PCpuLoad)
  }

  // @@protoc_insertion_point(class_scope:v1.PCpuLoad)
  private static final com.navercorp.pinpoint.grpc.trace.PCpuLoad DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.navercorp.pinpoint.grpc.trace.PCpuLoad();
  }

  public static com.navercorp.pinpoint.grpc.trace.PCpuLoad getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PCpuLoad>
      PARSER = new com.google.protobuf.AbstractParser<PCpuLoad>() {
    public PCpuLoad parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PCpuLoad(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PCpuLoad> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PCpuLoad> getParserForType() {
    return PARSER;
  }

  public com.navercorp.pinpoint.grpc.trace.PCpuLoad getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

