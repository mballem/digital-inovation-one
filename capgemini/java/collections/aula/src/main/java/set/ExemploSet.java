package set;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {
        System.out.println("Criar um conjunto de notas e exibir no console");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5.0, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores do conjunto");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double nota = iterator.next();
            soma += nota;
        }
        System.out.println("Exiba a soma dos valores do conjunto: " + soma);
        System.out.println("Exiba a média dos valores do conjunto: " + soma / notas.size());

        System.out.println("Remova a nota 0.0");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remover todas as notas menores que 7 e exibir a lista");
        iterator = notas.iterator();
        while (iterator.hasNext()) {
            Double nota = iterator.next();
            if (nota < 7.0) {
                iterator.remove();
            }
        }
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(5.5);
        notas2.add(6.3);
        notas2.add(8.5);
        notas2.add(5.0);
        notas2.add(4.8);
        notas2.add(8.8);
        notas2.add(8.5);
        notas2.add(1.7);
        System.out.println(notas2);

        System.out.println("Imprima com a ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo conjunto notas");
        notas.clear();
        System.out.println("Confira se o conjunto notas está vazio: " + notas.isEmpty());
    }
}
