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
public final class StatGrpc {

  private StatGrpc() {}

  public static final String SERVICE_NAME = "v1.Stat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PStatMessage,
      com.google.protobuf.Empty> getSendAgentStatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAgentStat",
      requestType = com.navercorp.pinpoint.grpc.trace.PStatMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PStatMessage,
      com.google.protobuf.Empty> getSendAgentStatMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PStatMessage, com.google.protobuf.Empty> getSendAgentStatMethod;
    if ((getSendAgentStatMethod = StatGrpc.getSendAgentStatMethod) == null) {
      synchronized (StatGrpc.class) {
        if ((getSendAgentStatMethod = StatGrpc.getSendAgentStatMethod) == null) {
          StatGrpc.getSendAgentStatMethod = getSendAgentStatMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PStatMessage, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "v1.Stat", "SendAgentStat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PStatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new StatMethodDescriptorSupplier("SendAgentStat"))
                  .build();
          }
        }
     }
     return getSendAgentStatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StatStub newStub(io.grpc.Channel channel) {
    return new StatStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StatBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StatFutureStub(channel);
  }

  /**
   */
  public static abstract class StatImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PStatMessage> sendAgentStat(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendAgentStatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendAgentStatMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PStatMessage,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_AGENT_STAT)))
          .build();
    }
  }

  /**
   */
  public static final class StatStub extends io.grpc.stub.AbstractStub<StatStub> {
    private StatStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StatStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StatStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PStatMessage> sendAgentStat(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendAgentStatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StatBlockingStub extends io.grpc.stub.AbstractStub<StatBlockingStub> {
    private StatBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StatBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StatBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class StatFutureStub extends io.grpc.stub.AbstractStub<StatFutureStub> {
    private StatFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StatFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StatFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_AGENT_STAT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StatImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StatImplBase serviceImpl, int methodId) {
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
        case METHODID_SEND_AGENT_STAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendAgentStat(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Stat");
    }
  }

  private static final class StatFileDescriptorSupplier
      extends StatBaseDescriptorSupplier {
    StatFileDescriptorSupplier() {}
  }

  private static final class StatMethodDescriptorSupplier
      extends StatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StatMethodDescriptorSupplier(String methodName) {
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
      synchronized (StatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StatFileDescriptorSupplier())
              .addMethod(getSendAgentStatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
