package one.digitalinnovation.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        // HashSet não garante a ordem de inserção e não permite valores repetidos
        Set<Double> notas = new HashSet<>();
        notas.add(5.8);
        notas.add(9.3);
        notas.add(6.5);
        notas.add(10.0);
        notas.add(5.4);
        notas.add(7.3);
        notas.add(3.8);
        notas.add(4.0);

        System.out.println(notas);

        // Remove a nota do set
        notas.remove(3.8);

        System.out.println(notas);

        // Retorna a quantidade de itens no set
        System.out.println(notas.size());

        // navega nos itens do set
        for (Double nota : notas) {
            System.out.println("-> " + nota);
        }

        // limpa o set
        notas.clear();

        System.out.println("notas set está vazia: " + notas.isEmpty());
    }
}
