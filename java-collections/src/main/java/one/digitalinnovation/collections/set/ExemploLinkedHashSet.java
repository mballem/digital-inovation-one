package one.digitalinnovation.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        // LinkedHashSet garante a ordem de inserção e não permite valores repetidos
        // mais lenta que a HashSet por manter a ordem de inserção
        Set<Double> notas = new LinkedHashSet<>();
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
