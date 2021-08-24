package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExemploStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 0, 4, 1, 2, 3, 9, 9, 6, 5);

        System.out.println("Listar todos os elementos da lista");
        numeros.forEach(System.out::println);

        System.out.println("Imprimir os 5 primeiros valores da lista");
        numeros.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println("Insira e imprima em um Set os 5 primeiros valores da lista");
        numeros.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Insira em um Set externo os 5 primeiros valores da lista");
        Set<Integer> collect = numeros.stream()
                .limit(5)
                .collect(Collectors.toSet());
        collect.forEach(System.out::println);

        System.out.println("Adicione em uma lista todos os numeros pares maiores que 2");
        List<Integer> collect1 = numeros.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 2)
                .collect(Collectors.toList());
        collect1.forEach(System.out::println);

        System.out.print("Some todos os valores impares da lista: ");
        int soma = numeros.stream()
                .filter(n -> n % 2 != 0)
                .flatMapToInt(IntStream::of)
                .sum();
        System.out.println(soma);

        System.out.println("Exiba a média dos numeros: ");
        OptionalDouble average = numeros.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        average.ifPresent(System.out::println);

        List<Integer> valores = new ArrayList<>();
        valores.add(3);
        valores.add(4);
        valores.add(1);
        valores.add(6);
        valores.add(9);
        valores.add(8);
        System.out.println("Remova os valores maiores que 6 e imprima a lista ordenada");
        valores.removeIf(n -> n > 6);
        valores.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
