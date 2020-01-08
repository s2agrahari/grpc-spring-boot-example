package com.groww.grpc.server;

import com.groww.grpc.commons.stream.InputNumber;
import com.groww.grpc.commons.stream.NumberStreamServiceGrpc;
import com.groww.grpc.commons.stream.OutputNumber;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService(interceptors = {LogInterceptor.class})
@Slf4j
public class NumberStreamService extends NumberStreamServiceGrpc.NumberStreamServiceImplBase {

    @Override
    public void streamIncrementedNumber(InputNumber inputNumber, StreamObserver<OutputNumber> responseObserver) {
        for (int i = 1; i < 20; i++) {
            val output = OutputNumber.newBuilder().setNumber(inputNumber.getNumber() + i).build();
            log.info("Sending number {}", output);
            try {
                Thread.sleep(1000);
                responseObserver.onNext(output);
            } catch (InterruptedException e) {
                log.error("Error ", e);
            }
        }
        responseObserver.onCompleted();
    }

}
