package com.groww.grpc.commons.stream;

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
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: number-stream.proto")
public final class NumberStreamServiceGrpc {

  private NumberStreamServiceGrpc() {}

  public static final String SERVICE_NAME = "NumberStreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.groww.grpc.commons.stream.InputNumber,
      com.groww.grpc.commons.stream.OutputNumber> getStreamIncrementedNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamIncrementedNumber",
      requestType = com.groww.grpc.commons.stream.InputNumber.class,
      responseType = com.groww.grpc.commons.stream.OutputNumber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.groww.grpc.commons.stream.InputNumber,
      com.groww.grpc.commons.stream.OutputNumber> getStreamIncrementedNumberMethod() {
    io.grpc.MethodDescriptor<com.groww.grpc.commons.stream.InputNumber, com.groww.grpc.commons.stream.OutputNumber> getStreamIncrementedNumberMethod;
    if ((getStreamIncrementedNumberMethod = NumberStreamServiceGrpc.getStreamIncrementedNumberMethod) == null) {
      synchronized (NumberStreamServiceGrpc.class) {
        if ((getStreamIncrementedNumberMethod = NumberStreamServiceGrpc.getStreamIncrementedNumberMethod) == null) {
          NumberStreamServiceGrpc.getStreamIncrementedNumberMethod = getStreamIncrementedNumberMethod =
              io.grpc.MethodDescriptor.<com.groww.grpc.commons.stream.InputNumber, com.groww.grpc.commons.stream.OutputNumber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamIncrementedNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.groww.grpc.commons.stream.InputNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.groww.grpc.commons.stream.OutputNumber.getDefaultInstance()))
              .setSchemaDescriptor(new NumberStreamServiceMethodDescriptorSupplier("streamIncrementedNumber"))
              .build();
        }
      }
    }
    return getStreamIncrementedNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NumberStreamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NumberStreamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NumberStreamServiceStub>() {
        @java.lang.Override
        public NumberStreamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NumberStreamServiceStub(channel, callOptions);
        }
      };
    return NumberStreamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NumberStreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NumberStreamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NumberStreamServiceBlockingStub>() {
        @java.lang.Override
        public NumberStreamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NumberStreamServiceBlockingStub(channel, callOptions);
        }
      };
    return NumberStreamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NumberStreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NumberStreamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NumberStreamServiceFutureStub>() {
        @java.lang.Override
        public NumberStreamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NumberStreamServiceFutureStub(channel, callOptions);
        }
      };
    return NumberStreamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NumberStreamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void streamIncrementedNumber(com.groww.grpc.commons.stream.InputNumber request,
        io.grpc.stub.StreamObserver<com.groww.grpc.commons.stream.OutputNumber> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamIncrementedNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamIncrementedNumberMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.groww.grpc.commons.stream.InputNumber,
                com.groww.grpc.commons.stream.OutputNumber>(
                  this, METHODID_STREAM_INCREMENTED_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class NumberStreamServiceStub extends io.grpc.stub.AbstractAsyncStub<NumberStreamServiceStub> {
    private NumberStreamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberStreamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NumberStreamServiceStub(channel, callOptions);
    }

    /**
     */
    public void streamIncrementedNumber(com.groww.grpc.commons.stream.InputNumber request,
        io.grpc.stub.StreamObserver<com.groww.grpc.commons.stream.OutputNumber> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamIncrementedNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NumberStreamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NumberStreamServiceBlockingStub> {
    private NumberStreamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberStreamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NumberStreamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.groww.grpc.commons.stream.OutputNumber> streamIncrementedNumber(
        com.groww.grpc.commons.stream.InputNumber request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamIncrementedNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NumberStreamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NumberStreamServiceFutureStub> {
    private NumberStreamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberStreamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NumberStreamServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_INCREMENTED_NUMBER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NumberStreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NumberStreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_INCREMENTED_NUMBER:
          serviceImpl.streamIncrementedNumber((com.groww.grpc.commons.stream.InputNumber) request,
              (io.grpc.stub.StreamObserver<com.groww.grpc.commons.stream.OutputNumber>) responseObserver);
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

  private static abstract class NumberStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NumberStreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.groww.grpc.commons.stream.NumberStreamProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NumberStreamService");
    }
  }

  private static final class NumberStreamServiceFileDescriptorSupplier
      extends NumberStreamServiceBaseDescriptorSupplier {
    NumberStreamServiceFileDescriptorSupplier() {}
  }

  private static final class NumberStreamServiceMethodDescriptorSupplier
      extends NumberStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NumberStreamServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NumberStreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NumberStreamServiceFileDescriptorSupplier())
              .addMethod(getStreamIncrementedNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
