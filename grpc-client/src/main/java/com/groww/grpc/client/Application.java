package com.groww.grpc.client;

import com.google.common.util.concurrent.ListenableFuture;
import com.groww.grpc.commons.GreeterGrpc;
import com.groww.grpc.commons.HelloReply;
import com.groww.grpc.commons.HelloRequest;
import com.groww.grpc.commons.stream.InputNumber;
import com.groww.grpc.commons.stream.NumberStreamServiceGrpc;
import com.groww.grpc.commons.stream.OutputNumber;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
@Slf4j
public class Application {

  public static void main(String[] args) {

    SpringApplication.run(Application.class, args);

    ManagedChannel channel =
        ManagedChannelBuilder.forAddress("127.0.0.1", 6565).usePlaintext().build();

    executeServerStream(channel);
  }

  public static void executeServerStream(ManagedChannel channel) {

    Scanner scanner = new Scanner(System.in);

    NumberStreamServiceGrpc.NumberStreamServiceBlockingStub stub =
        NumberStreamServiceGrpc.newBlockingStub(channel);

    while (scanner.hasNext()) {

      val inputNumber = InputNumber.newBuilder().setNumber(scanner.nextInt()).build();

      Iterator<OutputNumber> streamOutput = stub.streamIncrementedNumber(inputNumber);

      log.info("Started Streaming...");

      while (streamOutput.hasNext()) {
        log.info("Incremented Streamed Output {}", streamOutput.next());
      }
    }
  }

  public static void executeRequestResponseCall(ManagedChannel channel) {

    Scanner scanner = new Scanner(System.in);

    GreeterGrpc.GreeterFutureStub stub = GreeterGrpc.newFutureStub(channel);

    while (scanner.hasNext()) {

      ListenableFuture<HelloReply> helloReply =
          stub.sayHello(HelloRequest.newBuilder().setName(scanner.next()).build());

      helloReply.addListener(
          () -> {
            try {
              System.out.println(
                  "Nano Time => "
                      + LocalDateTime.now().getNano()
                      + " Response => "
                      + helloReply.get());
            } catch (InterruptedException e) {
              e.printStackTrace();
            } catch (ExecutionException e) {
              e.printStackTrace();
            }
          },
          Runnable::run);
    }
  }
}
