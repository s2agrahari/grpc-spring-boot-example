package com.groww.grpc.server;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT>
    interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {

//        log.info("Authority {}", serverCall.getAuthority());
//        log.info("Attribute {}", serverCall.getAttributes().toString());
//        log.info("MetaData {}", metadata.keys());

        return serverCallHandler.startCall(serverCall, metadata);
    }
}
