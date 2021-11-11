package me.dio.reactive;

import io.reactivex.Flowable;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PrintReactive {
    public static void main(String[] args) throws InterruptedException {
        Flowable.interval(1,1, SECONDS)
                .map(n -> n + 1)
                .subscribe(System.out::println);
        SECONDS.sleep(3);
    }
}
