package me.dio.reactive;

import io.reactivex.Flowable;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PrintReactiveErrorFlow {
    public static void main(String[] args) throws InterruptedException {
        Flowable.interval(1, 1, SECONDS)
                .map(PrintReactiveErrorFlow::trasnform)
                .subscribe(
                        PrintReactiveErrorFlow::process,
                        PrintReactiveErrorFlow::dealWithError
                );
        SECONDS.sleep(10);
    }

    private static void dealWithError(Throwable throwable) {
        throwable.printStackTrace();
    }

    private static void process(Long number) {
        System.out.println("Receive number " + number);
    }

    private static Long trasnform(Long number) {
        if (new Random().nextDouble() < 0.3) throw new RuntimeException("Ops!");
        return number * 2;
    }
}
