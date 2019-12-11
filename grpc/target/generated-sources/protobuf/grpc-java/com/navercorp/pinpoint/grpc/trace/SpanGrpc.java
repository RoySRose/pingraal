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
public final class SpanGrpc {

  private SpanGrpc() {}

  public static final String SERVICE_NAME = "v1.Span";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PSpanMessage,
      com.google.protobuf.Empty> getSendSpanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSpan",
      requestType = com.navercorp.pinpoint.grpc.trace.PSpanMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PSpanMessage,
      com.google.protobuf.Empty> getSendSpanMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PSpanMessage, com.google.protobuf.Empty> getSendSpanMethod;
    if ((getSendSpanMethod = SpanGrpc.getSendSpanMethod) == null) {
      synchronized (SpanGrpc.class) {
        if ((getSendSpanMethod = SpanGrpc.getSendSpanMethod) == null) {
          SpanGrpc.getSendSpanMethod = getSendSpanMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PSpanMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "v1.Span", "SendSpan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PSpanMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SpanMethodDescriptorSupplier("SendSpan"))
                  .build();
          }
        }
     }
     return getSendSpanMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpanStub newStub(io.grpc.Channel channel) {
    return new SpanStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpanBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpanBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpanFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpanFutureStub(channel);
  }

  /**
   */
  public static abstract class SpanImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PSpanMessage> sendSpan(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendSpanMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendSpanMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PSpanMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_SPAN)))
          .build();
    }
  }

  /**
   */
  public static final class SpanStub extends io.grpc.stub.AbstractStub<SpanStub> {
    private SpanStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpanStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpanStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PSpanMessage> sendSpan(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendSpanMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SpanBlockingStub extends io.grpc.stub.AbstractStub<SpanBlockingStub> {
    private SpanBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpanBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpanBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SpanFutureStub extends io.grpc.stub.AbstractStub<SpanFutureStub> {
    private SpanFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpanFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpanFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpanFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_SPAN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpanImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpanImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_SPAN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendSpan(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SpanBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpanBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Span");
    }
  }

  private static final class SpanFileDescriptorSupplier
      extends SpanBaseDescriptorSupplier {
    SpanFileDescriptorSupplier() {}
  }

  private static final class SpanMethodDescriptorSupplier
      extends SpanBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpanMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpanGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpanFileDescriptorSupplier())
              .addMethod(getSendSpanMethod())
              .build();
        }
      }
    }
    return result;
  }
}
