package com.navercorp.pinpoint.grpc.trace;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: Service.proto")
public final class MetadataGrpc {

  private MetadataGrpc() {}

  public static final String SERVICE_NAME = "v1.Metadata";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PSqlMetaData,
      com.navercorp.pinpoint.grpc.trace.PResult> getRequestSqlMetaDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestSqlMetaData",
      requestType = com.navercorp.pinpoint.grpc.trace.PSqlMetaData.class,
      responseType = com.navercorp.pinpoint.grpc.trace.PResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PSqlMetaData,
      com.navercorp.pinpoint.grpc.trace.PResult> getRequestSqlMetaDataMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PSqlMetaData, com.navercorp.pinpoint.grpc.trace.PResult> getRequestSqlMetaDataMethod;
    if ((getRequestSqlMetaDataMethod = MetadataGrpc.getRequestSqlMetaDataMethod) == null) {
      synchronized (MetadataGrpc.class) {
        if ((getRequestSqlMetaDataMethod = MetadataGrpc.getRequestSqlMetaDataMethod) == null) {
          MetadataGrpc.getRequestSqlMetaDataMethod = getRequestSqlMetaDataMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PSqlMetaData, com.navercorp.pinpoint.grpc.trace.PResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.Metadata", "RequestSqlMetaData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PSqlMetaData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PResult.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataMethodDescriptorSupplier("RequestSqlMetaData"))
                  .build();
          }
        }
     }
     return getRequestSqlMetaDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PApiMetaData,
      com.navercorp.pinpoint.grpc.trace.PResult> getRequestApiMetaDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestApiMetaData",
      requestType = com.navercorp.pinpoint.grpc.trace.PApiMetaData.class,
      responseType = com.navercorp.pinpoint.grpc.trace.PResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PApiMetaData,
      com.navercorp.pinpoint.grpc.trace.PResult> getRequestApiMetaDataMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PApiMetaData, com.navercorp.pinpoint.grpc.trace.PResult> getRequestApiMetaDataMethod;
    if ((getRequestApiMetaDataMethod = MetadataGrpc.getRequestApiMetaDataMethod) == null) {
      synchronized (MetadataGrpc.class) {
        if ((getRequestApiMetaDataMethod = MetadataGrpc.getRequestApiMetaDataMethod) == null) {
          MetadataGrpc.getRequestApiMetaDataMethod = getRequestApiMetaDataMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PApiMetaData, com.navercorp.pinpoint.grpc.trace.PResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.Metadata", "RequestApiMetaData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PApiMetaData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PResult.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataMethodDescriptorSupplier("RequestApiMetaData"))
                  .build();
          }
        }
     }
     return getRequestApiMetaDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PStringMetaData,
      com.navercorp.pinpoint.grpc.trace.PResult> getRequestStringMetaDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestStringMetaData",
      requestType = com.navercorp.pinpoint.grpc.trace.PStringMetaData.class,
      responseType = com.navercorp.pinpoint.grpc.trace.PResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PStringMetaData,
      com.navercorp.pinpoint.grpc.trace.PResult> getRequestStringMetaDataMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PStringMetaData, com.navercorp.pinpoint.grpc.trace.PResult> getRequestStringMetaDataMethod;
    if ((getRequestStringMetaDataMethod = MetadataGrpc.getRequestStringMetaDataMethod) == null) {
      synchronized (MetadataGrpc.class) {
        if ((getRequestStringMetaDataMethod = MetadataGrpc.getRequestStringMetaDataMethod) == null) {
          MetadataGrpc.getRequestStringMetaDataMethod = getRequestStringMetaDataMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PStringMetaData, com.navercorp.pinpoint.grpc.trace.PResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.Metadata", "RequestStringMetaData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PStringMetaData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PResult.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataMethodDescriptorSupplier("RequestStringMetaData"))
                  .build();
          }
        }
     }
     return getRequestStringMetaDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetadataStub newStub(io.grpc.Channel channel) {
    return new MetadataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetadataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetadataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetadataFutureStub(channel);
  }

  /**
   */
  public static abstract class MetadataImplBase implements io.grpc.BindableService {

    /**
     */
    public void requestSqlMetaData(com.navercorp.pinpoint.grpc.trace.PSqlMetaData request,
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestSqlMetaDataMethod(), responseObserver);
    }

    /**
     */
    public void requestApiMetaData(com.navercorp.pinpoint.grpc.trace.PApiMetaData request,
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestApiMetaDataMethod(), responseObserver);
    }

    /**
     */
    public void requestStringMetaData(com.navercorp.pinpoint.grpc.trace.PStringMetaData request,
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestStringMetaDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestSqlMetaDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PSqlMetaData,
                com.navercorp.pinpoint.grpc.trace.PResult>(
                  this, METHODID_REQUEST_SQL_META_DATA)))
          .addMethod(
            getRequestApiMetaDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PApiMetaData,
                com.navercorp.pinpoint.grpc.trace.PResult>(
                  this, METHODID_REQUEST_API_META_DATA)))
          .addMethod(
            getRequestStringMetaDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PStringMetaData,
                com.navercorp.pinpoint.grpc.trace.PResult>(
                  this, METHODID_REQUEST_STRING_META_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class MetadataStub extends io.grpc.stub.AbstractStub<MetadataStub> {
    private MetadataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataStub(channel, callOptions);
    }

    /**
     */
    public void requestSqlMetaData(com.navercorp.pinpoint.grpc.trace.PSqlMetaData request,
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestSqlMetaDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestApiMetaData(com.navercorp.pinpoint.grpc.trace.PApiMetaData request,
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestApiMetaDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestStringMetaData(com.navercorp.pinpoint.grpc.trace.PStringMetaData request,
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestStringMetaDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetadataBlockingStub extends io.grpc.stub.AbstractStub<MetadataBlockingStub> {
    private MetadataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.navercorp.pinpoint.grpc.trace.PResult requestSqlMetaData(com.navercorp.pinpoint.grpc.trace.PSqlMetaData request) {
      return blockingUnaryCall(
          getChannel(), getRequestSqlMetaDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.navercorp.pinpoint.grpc.trace.PResult requestApiMetaData(com.navercorp.pinpoint.grpc.trace.PApiMetaData request) {
      return blockingUnaryCall(
          getChannel(), getRequestApiMetaDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.navercorp.pinpoint.grpc.trace.PResult requestStringMetaData(com.navercorp.pinpoint.grpc.trace.PStringMetaData request) {
      return blockingUnaryCall(
          getChannel(), getRequestStringMetaDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetadataFutureStub extends io.grpc.stub.AbstractStub<MetadataFutureStub> {
    private MetadataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.navercorp.pinpoint.grpc.trace.PResult> requestSqlMetaData(
        com.navercorp.pinpoint.grpc.trace.PSqlMetaData request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestSqlMetaDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.navercorp.pinpoint.grpc.trace.PResult> requestApiMetaData(
        com.navercorp.pinpoint.grpc.trace.PApiMetaData request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestApiMetaDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.navercorp.pinpoint.grpc.trace.PResult> requestStringMetaData(
        com.navercorp.pinpoint.grpc.trace.PStringMetaData request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestStringMetaDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_SQL_META_DATA = 0;
  private static final int METHODID_REQUEST_API_META_DATA = 1;
  private static final int METHODID_REQUEST_STRING_META_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetadataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetadataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_SQL_META_DATA:
          serviceImpl.requestSqlMetaData((com.navercorp.pinpoint.grpc.trace.PSqlMetaData) request,
              (io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult>) responseObserver);
          break;
        case METHODID_REQUEST_API_META_DATA:
          serviceImpl.requestApiMetaData((com.navercorp.pinpoint.grpc.trace.PApiMetaData) request,
              (io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult>) responseObserver);
          break;
        case METHODID_REQUEST_STRING_META_DATA:
          serviceImpl.requestStringMetaData((com.navercorp.pinpoint.grpc.trace.PStringMetaData) request,
              (io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MetadataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetadataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Metadata");
    }
  }

  private static final class MetadataFileDescriptorSupplier
      extends MetadataBaseDescriptorSupplier {
    MetadataFileDescriptorSupplier() {}
  }

  private static final class MetadataMethodDescriptorSupplier
      extends MetadataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetadataMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetadataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetadataFileDescriptorSupplier())
              .addMethod(getRequestSqlMetaDataMethod())
              .addMethod(getRequestApiMetaDataMethod())
              .addMethod(getRequestStringMetaDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
