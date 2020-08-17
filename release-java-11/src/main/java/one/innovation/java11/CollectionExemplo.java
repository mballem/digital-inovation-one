package one.innovation.java11;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionExemplo {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Bia", "Tito", "Nunes", "Carla", "Iago");
        System.out.println(nomes);

        Collection<String> marcas = Set.of("Ford", "GM", "Honda", "Ferrari", "Mac Laren", "Fiat", "Yamaha");
        System.out.println(marcas);
    }
}
