package one.digitalinnovation.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        // TreeSet ordena os elementos inseridos e não permite valores repetidos
        // mais lenta que a HashSet e TreeSer por realizar a ordenação
        TreeSet<Double> notas = new TreeSet<>();
        notas.add(5.8);
        notas.add(9.3);
        notas.add(6.5);
        notas.add(10.0);
        notas.add(5.4);
        notas.add(7.3);
        notas.add(3.8);
        notas.add(4.0);

        System.out.println(notas);

        // Retorna o primeiro elemento do set
        System.out.println(notas.first());

        // Retorna o último elemento do set
        System.out.println(notas.last());

        System.out.println(notas);

        // Retorna o elemento anterior ao elemento indicado
        System.out.println(notas.lower(5.8));

        // Retorna o elemento posterior ao elemento indicado
        System.out.println(notas.higher(5.8));

        System.out.println(notas);

        // Retorna e remove o primeiro elemento
        System.out.println(notas.pollFirst());

        // Retorna e remove o último elemento
        System.out.println(notas.pollLast());

        System.out.println(notas);

        notas.add(8.0);
        notas.add(9.3); // elemento repetido, não será inserido no set
        notas.add(4.0); // elemento repetido, não será inserido no set
        notas.add(9.7);
        notas.add(7.9);

        System.out.println(notas);

        for (Double nota : notas) {
            System.out.println("Nota: " + nota);
        }
    }
}
