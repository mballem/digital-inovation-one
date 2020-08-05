package one.digitalinnovation.collections.optional;

import java.util.Optional;

public class ExemploOptionals {

    public static void main(String[] args) {

        Optional<String> optionalS = Optional.of("Valor opcional");

        System.out.println(optionalS.isPresent());
        System.out.println(optionalS.isEmpty());

        optionalS.ifPresent(System.out::println);

        optionalS.ifPresentOrElse(System.out::println, () -> System.out.println("Nenhum valor presente"));

        optionalS = Optional.empty();

        optionalS.ifPresentOrElse(System.out::println, () -> System.out.println("Nenhum valor presente"));

        optionalS = Optional.ofNullable("Novo valor presente");

        if (optionalS.isPresent()) {
            System.out.println(optionalS.get());
        }

        optionalS.map((v) -> v.concat(" : Olá Mundo!")).ifPresent(System.out::println);

        optionalS = Optional.empty();

        optionalS.orElseThrow(() -> new IllegalStateException("Ops... Objeto está vazio!"));

    }
}
