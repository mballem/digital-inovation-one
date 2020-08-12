package one.innovation.functional.aula2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo", "Oliveira", "Santos", "Instrutor", "Java", "João"};
        imprimirNomesFiltrados(nomes);

        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirODobroDeCadaValor(numeros);

        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5);
        inteiros.stream()
                .map(i -> i * 3)
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        // forma tradicional
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("João")) {
                nomesParaImprimir += "" + nomes[i];
            }
        }
        System.out.println(nomesParaImprimir);

        // com Stream
        String nomesStream = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                .collect(Collectors.joining());

        System.out.println(nomesStream);

    }

    public static void imprimirODobroDeCadaValor(Integer... numeros) {
        Stream.of(numeros)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
