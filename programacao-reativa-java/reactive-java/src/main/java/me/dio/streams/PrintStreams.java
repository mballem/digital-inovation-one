package me.dio.streams;

import java.util.stream.IntStream;

public class PrintStreams {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3)
                .forEach(System.out::println);
    }
}
