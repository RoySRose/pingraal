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
public final class AgentGrpc {

  private AgentGrpc() {}

  public static final String SERVICE_NAME = "v1.Agent";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PAgentInfo,
      com.navercorp.pinpoint.grpc.trace.PResult> getRequestAgentInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestAgentInfo",
      requestType = com.navercorp.pinpoint.grpc.trace.PAgentInfo.class,
      responseType = com.navercorp.pinpoint.grpc.trace.PResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PAgentInfo,
      com.navercorp.pinpoint.grpc.trace.PResult> getRequestAgentInfoMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PAgentInfo, com.navercorp.pinpoint.grpc.trace.PResult> getRequestAgentInfoMethod;
    if ((getRequestAgentInfoMethod = AgentGrpc.getRequestAgentInfoMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getRequestAgentInfoMethod = AgentGrpc.getRequestAgentInfoMethod) == null) {
          AgentGrpc.getRequestAgentInfoMethod = getRequestAgentInfoMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PAgentInfo, com.navercorp.pinpoint.grpc.trace.PResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.Agent", "RequestAgentInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PAgentInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PResult.getDefaultInstance()))
                  .setSchemaDescriptor(new AgentMethodDescriptorSupplier("RequestAgentInfo"))
                  .build();
          }
        }
     }
     return getRequestAgentInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PPing,
      com.navercorp.pinpoint.grpc.trace.PPing> getPingSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingSession",
      requestType = com.navercorp.pinpoint.grpc.trace.PPing.class,
      responseType = com.navercorp.pinpoint.grpc.trace.PPing.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PPing,
      com.navercorp.pinpoint.grpc.trace.PPing> getPingSessionMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PPing, com.navercorp.pinpoint.grpc.trace.PPing> getPingSessionMethod;
    if ((getPingSessionMethod = AgentGrpc.getPingSessionMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getPingSessionMethod = AgentGrpc.getPingSessionMethod) == null) {
          AgentGrpc.getPingSessionMethod = getPingSessionMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PPing, com.navercorp.pinpoint.grpc.trace.PPing>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "v1.Agent", "PingSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PPing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PPing.getDefaultInstance()))
                  .setSchemaDescriptor(new AgentMethodDescriptorSupplier("PingSession"))
                  .build();
          }
        }
     }
     return getPingSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentStub newStub(io.grpc.Channel channel) {
    return new AgentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AgentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AgentFutureStub(channel);
  }

  /**
   */
  public static abstract class AgentImplBase implements io.grpc.BindableService {

    /**
     */
    public void requestAgentInfo(com.navercorp.pinpoint.grpc.trace.PAgentInfo request,
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestAgentInfoMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PPing> pingSession(
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PPing> responseObserver) {
      return asyncUnimplementedStreamingCall(getPingSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestAgentInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PAgentInfo,
                com.navercorp.pinpoint.grpc.trace.PResult>(
                  this, METHODID_REQUEST_AGENT_INFO)))
          .addMethod(
            getPingSessionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PPing,
                com.navercorp.pinpoint.grpc.trace.PPing>(
                  this, METHODID_PING_SESSION)))
          .build();
    }
  }

  /**
   */
  public static final class AgentStub extends io.grpc.stub.AbstractStub<AgentStub> {
    private AgentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentStub(channel, callOptions);
    }

    /**
     */
    public void requestAgentInfo(com.navercorp.pinpoint.grpc.trace.PAgentInfo request,
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestAgentInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PPing> pingSession(
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PPing> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPingSessionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AgentBlockingStub extends io.grpc.stub.AbstractStub<AgentBlockingStub> {
    private AgentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.navercorp.pinpoint.grpc.trace.PResult requestAgentInfo(com.navercorp.pinpoint.grpc.trace.PAgentInfo request) {
      return blockingUnaryCall(
          getChannel(), getRequestAgentInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AgentFutureStub extends io.grpc.stub.AbstractStub<AgentFutureStub> {
    private AgentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.navercorp.pinpoint.grpc.trace.PResult> requestAgentInfo(
        com.navercorp.pinpoint.grpc.trace.PAgentInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestAgentInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_AGENT_INFO = 0;
  private static final int METHODID_PING_SESSION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_AGENT_INFO:
          serviceImpl.requestAgentInfo((com.navercorp.pinpoint.grpc.trace.PAgentInfo) request,
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
        case METHODID_PING_SESSION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.pingSession(
              (io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PPing>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AgentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Agent");
    }
  }

  private static final class AgentFileDescriptorSupplier
      extends AgentBaseDescriptorSupplier {
    AgentFileDescriptorSupplier() {}
  }

  private static final class AgentMethodDescriptorSupplier
      extends AgentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AgentMethodDescriptorSupplier(String methodName) {
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
      synchronized (AgentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentFileDescriptorSupplier())
              .addMethod(getRequestAgentInfoMethod())
              .addMethod(getPingSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
