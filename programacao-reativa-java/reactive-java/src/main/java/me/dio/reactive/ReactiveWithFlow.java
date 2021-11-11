package me.dio.reactive;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.logging.Logger;
import java.util.stream.IntStream;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ReactiveWithFlow {
    private static Logger log = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        CustomSubscriber subscriber = new CustomSubscriber();
        try(SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>()) {
            publisher.subscribe(subscriber);
            IntStream.range(1, 10).forEach(i -> {
                log.info(String.format("emitting %s", i));
                publisher.submit(i);
            });
        }
    }

    private static void sleep() {
        try {
            SECONDS.sleep(10);
        } catch (InterruptedException e) {
            log.severe(e.getMessage());
            Thread.currentThread().interrupt();
        }

    }
}

class CustomSubscriber implements Flow.Subscriber<Integer> {
    private final Logger log = Logger.getAnonymousLogger();
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(5);
    }

    @Override
    public void onNext(Integer item) {
        log.info(String.format("receiving %s", item));
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        log.info("Done!");
    }
}
