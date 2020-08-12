package one.innovation.functional.aula2;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Java"));

        Predicate<Integer> ehPar = valor -> valor % 2 == 0;
        System.out.println(ehPar.test(14));
        System.out.println(ehPar.test(5));
    }
}
