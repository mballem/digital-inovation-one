package one.digitalinnovation.collections.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivo {

    public static void main(String[] args) {

        System.out.println("--- Valor inteiro opcional ---");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("--- Valor double opcional ---");
        OptionalDouble.of(12.98).ifPresent(System.out::println);

        System.out.println("--- Valor long opcional ---");
        OptionalLong.of(12L).ifPresent(System.out::println);
    }
}
