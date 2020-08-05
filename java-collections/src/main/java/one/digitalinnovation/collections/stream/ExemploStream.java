package one.digitalinnovation.collections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        // Retorna o elemento com o maior numeto de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com o menor numeto de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna o elemento com o menor numeto de letras
        System.out.println("Com a letra r no nome: " + estudantes.stream()
                .filter((estudante) -> estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Nova coleção com nome + quant de letras: " + estudantes.stream()
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .collect(Collectors.toList()));

        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Os 3 primeiros estudantes: " + estudantes.stream()
                .limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna elementos: " + estudantes.stream()
                .peek(System.out::println)
                .collect(Collectors.toList()));

        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os nomes da coleção: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elementos possuem a letra 'W' no nome
        System.out.println("Todos os nomes tem letra W: " + estudantes.stream()
                .allMatch(elemento -> elemento.toLowerCase().contains("w")));

        // Retorna true se alguns dos elementos possuem a letra 'A' no nome
        System.out.println("Alguns nomes tem letra A: " + estudantes.stream()
                .anyMatch(elemento -> elemento.toLowerCase().contains("a")));

        // Retorna true se nenhum dos elementos possue a letra 'a' minuscula no nome
        System.out.println("Nenhum nome tem letra A minuscula: " + estudantes.stream()
                .noneMatch(elemento -> elemento.contains("a")));

        // Retorna o primeiro elemento da coleção se existir algum
        System.out.println("Primeiro elemento");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.println("Operação encadeada");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter(estudante -> estudante.toLowerCase().contains("r"))
                //.collect(Collectors.toList())
                //.collect(Collectors.joining(", "))
                //.collect(Collectors.toSet())
                .collect(Collectors.groupingBy(e -> e.substring(e.indexOf("-") + 1)))
        );
    }
}
