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
public final class ProfilerCommandServiceGrpc {

  private ProfilerCommandServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.ProfilerCommandService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdMessage,
      com.navercorp.pinpoint.grpc.trace.PCmdRequest> getHandleCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleCommand",
      requestType = com.navercorp.pinpoint.grpc.trace.PCmdMessage.class,
      responseType = com.navercorp.pinpoint.grpc.trace.PCmdRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdMessage,
      com.navercorp.pinpoint.grpc.trace.PCmdRequest> getHandleCommandMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdMessage, com.navercorp.pinpoint.grpc.trace.PCmdRequest> getHandleCommandMethod;
    if ((getHandleCommandMethod = ProfilerCommandServiceGrpc.getHandleCommandMethod) == null) {
      synchronized (ProfilerCommandServiceGrpc.class) {
        if ((getHandleCommandMethod = ProfilerCommandServiceGrpc.getHandleCommandMethod) == null) {
          ProfilerCommandServiceGrpc.getHandleCommandMethod = getHandleCommandMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PCmdMessage, com.navercorp.pinpoint.grpc.trace.PCmdRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProfilerCommandService", "HandleCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PCmdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PCmdRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfilerCommandServiceMethodDescriptorSupplier("HandleCommand"))
                  .build();
          }
        }
     }
     return getHandleCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse,
      com.google.protobuf.Empty> getCommandEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommandEcho",
      requestType = com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse,
      com.google.protobuf.Empty> getCommandEchoMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse, com.google.protobuf.Empty> getCommandEchoMethod;
    if ((getCommandEchoMethod = ProfilerCommandServiceGrpc.getCommandEchoMethod) == null) {
      synchronized (ProfilerCommandServiceGrpc.class) {
        if ((getCommandEchoMethod = ProfilerCommandServiceGrpc.getCommandEchoMethod) == null) {
          ProfilerCommandServiceGrpc.getCommandEchoMethod = getCommandEchoMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProfilerCommandService", "CommandEcho"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfilerCommandServiceMethodDescriptorSupplier("CommandEcho"))
                  .build();
          }
        }
     }
     return getCommandEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountRes,
      com.google.protobuf.Empty> getCommandStreamActiveThreadCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommandStreamActiveThreadCount",
      requestType = com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountRes.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountRes,
      com.google.protobuf.Empty> getCommandStreamActiveThreadCountMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountRes, com.google.protobuf.Empty> getCommandStreamActiveThreadCountMethod;
    if ((getCommandStreamActiveThreadCountMethod = ProfilerCommandServiceGrpc.getCommandStreamActiveThreadCountMethod) == null) {
      synchronized (ProfilerCommandServiceGrpc.class) {
        if ((getCommandStreamActiveThreadCountMethod = ProfilerCommandServiceGrpc.getCommandStreamActiveThreadCountMethod) == null) {
          ProfilerCommandServiceGrpc.getCommandStreamActiveThreadCountMethod = getCommandStreamActiveThreadCountMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountRes, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProfilerCommandService", "CommandStreamActiveThreadCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountRes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfilerCommandServiceMethodDescriptorSupplier("CommandStreamActiveThreadCount"))
                  .build();
          }
        }
     }
     return getCommandStreamActiveThreadCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes,
      com.google.protobuf.Empty> getCommandActiveThreadDumpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommandActiveThreadDump",
      requestType = com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes,
      com.google.protobuf.Empty> getCommandActiveThreadDumpMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes, com.google.protobuf.Empty> getCommandActiveThreadDumpMethod;
    if ((getCommandActiveThreadDumpMethod = ProfilerCommandServiceGrpc.getCommandActiveThreadDumpMethod) == null) {
      synchronized (ProfilerCommandServiceGrpc.class) {
        if ((getCommandActiveThreadDumpMethod = ProfilerCommandServiceGrpc.getCommandActiveThreadDumpMethod) == null) {
          ProfilerCommandServiceGrpc.getCommandActiveThreadDumpMethod = getCommandActiveThreadDumpMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProfilerCommandService", "CommandActiveThreadDump"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfilerCommandServiceMethodDescriptorSupplier("CommandActiveThreadDump"))
                  .build();
          }
        }
     }
     return getCommandActiveThreadDumpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes,
      com.google.protobuf.Empty> getCommandActiveThreadLightDumpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommandActiveThreadLightDump",
      requestType = com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes,
      com.google.protobuf.Empty> getCommandActiveThreadLightDumpMethod() {
    io.grpc.MethodDescriptor<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes, com.google.protobuf.Empty> getCommandActiveThreadLightDumpMethod;
    if ((getCommandActiveThreadLightDumpMethod = ProfilerCommandServiceGrpc.getCommandActiveThreadLightDumpMethod) == null) {
      synchronized (ProfilerCommandServiceGrpc.class) {
        if ((getCommandActiveThreadLightDumpMethod = ProfilerCommandServiceGrpc.getCommandActiveThreadLightDumpMethod) == null) {
          ProfilerCommandServiceGrpc.getCommandActiveThreadLightDumpMethod = getCommandActiveThreadLightDumpMethod = 
              io.grpc.MethodDescriptor.<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v1.ProfilerCommandService", "CommandActiveThreadLightDump"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfilerCommandServiceMethodDescriptorSupplier("CommandActiveThreadLightDump"))
                  .build();
          }
        }
     }
     return getCommandActiveThreadLightDumpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfilerCommandServiceStub newStub(io.grpc.Channel channel) {
    return new ProfilerCommandServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfilerCommandServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProfilerCommandServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfilerCommandServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProfilerCommandServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProfilerCommandServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PCmdMessage> handleCommand(
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PCmdRequest> responseObserver) {
      return asyncUnimplementedStreamingCall(getHandleCommandMethod(), responseObserver);
    }

    /**
     */
    public void commandEcho(com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCommandEchoMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountRes> commandStreamActiveThreadCount(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getCommandStreamActiveThreadCountMethod(), responseObserver);
    }

    /**
     */
    public void commandActiveThreadDump(com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCommandActiveThreadDumpMethod(), responseObserver);
    }

    /**
     */
    public void commandActiveThreadLightDump(com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCommandActiveThreadLightDumpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHandleCommandMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PCmdMessage,
                com.navercorp.pinpoint.grpc.trace.PCmdRequest>(
                  this, METHODID_HANDLE_COMMAND)))
          .addMethod(
            getCommandEchoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse,
                com.google.protobuf.Empty>(
                  this, METHODID_COMMAND_ECHO)))
          .addMethod(
            getCommandStreamActiveThreadCountMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountRes,
                com.google.protobuf.Empty>(
                  this, METHODID_COMMAND_STREAM_ACTIVE_THREAD_COUNT)))
          .addMethod(
            getCommandActiveThreadDumpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes,
                com.google.protobuf.Empty>(
                  this, METHODID_COMMAND_ACTIVE_THREAD_DUMP)))
          .addMethod(
            getCommandActiveThreadLightDumpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes,
                com.google.protobuf.Empty>(
                  this, METHODID_COMMAND_ACTIVE_THREAD_LIGHT_DUMP)))
          .build();
    }
  }

  /**
   */
  public static final class ProfilerCommandServiceStub extends io.grpc.stub.AbstractStub<ProfilerCommandServiceStub> {
    private ProfilerCommandServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfilerCommandServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfilerCommandServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfilerCommandServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PCmdMessage> handleCommand(
        io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PCmdRequest> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getHandleCommandMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void commandEcho(com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommandEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadCountRes> commandStreamActiveThreadCount(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCommandStreamActiveThreadCountMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void commandActiveThreadDump(com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommandActiveThreadDumpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commandActiveThreadLightDump(com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommandActiveThreadLightDumpMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProfilerCommandServiceBlockingStub extends io.grpc.stub.AbstractStub<ProfilerCommandServiceBlockingStub> {
    private ProfilerCommandServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfilerCommandServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfilerCommandServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfilerCommandServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty commandEcho(com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse request) {
      return blockingUnaryCall(
          getChannel(), getCommandEchoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty commandActiveThreadDump(com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes request) {
      return blockingUnaryCall(
          getChannel(), getCommandActiveThreadDumpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty commandActiveThreadLightDump(com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes request) {
      return blockingUnaryCall(
          getChannel(), getCommandActiveThreadLightDumpMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProfilerCommandServiceFutureStub extends io.grpc.stub.AbstractStub<ProfilerCommandServiceFutureStub> {
    private ProfilerCommandServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfilerCommandServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfilerCommandServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfilerCommandServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> commandEcho(
        com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse request) {
      return futureUnaryCall(
          getChannel().newCall(getCommandEchoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> commandActiveThreadDump(
        com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes request) {
      return futureUnaryCall(
          getChannel().newCall(getCommandActiveThreadDumpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> commandActiveThreadLightDump(
        com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes request) {
      return futureUnaryCall(
          getChannel().newCall(getCommandActiveThreadLightDumpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMAND_ECHO = 0;
  private static final int METHODID_COMMAND_ACTIVE_THREAD_DUMP = 1;
  private static final int METHODID_COMMAND_ACTIVE_THREAD_LIGHT_DUMP = 2;
  private static final int METHODID_HANDLE_COMMAND = 3;
  private static final int METHODID_COMMAND_STREAM_ACTIVE_THREAD_COUNT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProfilerCommandServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProfilerCommandServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMAND_ECHO:
          serviceImpl.commandEcho((com.navercorp.pinpoint.grpc.trace.PCmdEchoResponse) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_COMMAND_ACTIVE_THREAD_DUMP:
          serviceImpl.commandActiveThreadDump((com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadDumpRes) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_COMMAND_ACTIVE_THREAD_LIGHT_DUMP:
          serviceImpl.commandActiveThreadLightDump((com.navercorp.pinpoint.grpc.trace.PCmdActiveThreadLightDumpRes) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
        case METHODID_HANDLE_COMMAND:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handleCommand(
              (io.grpc.stub.StreamObserver<com.navercorp.pinpoint.grpc.trace.PCmdRequest>) responseObserver);
        case METHODID_COMMAND_STREAM_ACTIVE_THREAD_COUNT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.commandStreamActiveThreadCount(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProfilerCommandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProfilerCommandServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.navercorp.pinpoint.grpc.trace.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProfilerCommandService");
    }
  }

  private static final class ProfilerCommandServiceFileDescriptorSupplier
      extends ProfilerCommandServiceBaseDescriptorSupplier {
    ProfilerCommandServiceFileDescriptorSupplier() {}
  }

  private static final class ProfilerCommandServiceMethodDescriptorSupplier
      extends ProfilerCommandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProfilerCommandServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProfilerCommandServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProfilerCommandServiceFileDescriptorSupplier())
              .addMethod(getHandleCommandMethod())
              .addMethod(getCommandEchoMethod())
              .addMethod(getCommandStreamActiveThreadCountMethod())
              .addMethod(getCommandActiveThreadDumpMethod())
              .addMethod(getCommandActiveThreadLightDumpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
