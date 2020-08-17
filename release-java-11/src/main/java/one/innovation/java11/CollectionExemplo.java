package one.innovation.java11;

import java.util.*;

public class CollectionExemplo {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Beatriz", "Antônio", "Nunes", "Carla", "Iago");
        System.out.println(nomes);

        List<String> apelidos = List.of("Joca", "Bia", "Tonho", "Nu", "Carlinha", "Igo");
        System.out.println(apelidos);

        Collection<String> marcas = Set.of("Ford", "GM", "Honda", "Ferrari", "Mac Laren", "Fiat", "Yamaha");
        System.out.println(marcas);

    }
}
