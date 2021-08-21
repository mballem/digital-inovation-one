package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Adicionar 10 notas na lista");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(5.3);
        notas.add(8.8);
        notas.add(5.0);
        notas.add(0.0);
        notas.add(6.0);
        notas.add(4.4);
        notas.add(3.5);
        notas.add(6.5);
        notas.add(5.5);
        System.out.println("Notas adicionadas:\n" + notas);

        System.out.println("Remover a nota 6.0 e exibir a lista: ");
        notas.remove(6.0);
        System.out.println(notas);

        System.out.println("Exibir a nota da 3ª posição: " + notas.get(2));
        System.out.println("Exibir a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Exibir a menor nota: " + Collections.min(notas));
        System.out.println("Exibir a maior nota: " + Collections.max(notas));

        System.out.println("Exibir a soma entre todas as notas");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma = " + soma);

        System.out.println("Exibir a média entre todas as notas: " + (soma / notas.size()) );

        System.out.println("Alterar a nota 5.3 por 7.6 e exibir a lista");
        notas.set(notas.indexOf(5.3), 7.6);
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

        System.out.println("Limpara a lista");
        notas.clear();
        System.out.println("Confirmar se a lista está limpa: " + notas.isEmpty());

        System.out.println("Adicione 3 novas notas e exibas a lista");
        notas.add(7.0);
        notas.add(8.0);
        notas.add(5.0);
        System.out.println(notas);

        System.out.println("Inclua a nota 9.0 na posição 0 e exiba a lista");
        notas.add(0, 9.0);
        System.out.println(notas);

        System.out.println("Ordene e exiba a lista de forma crescente");
        Collections.sort(notas);
        System.out.println(notas);

        System.out.println("Ordene e exiba a lista de forma decresvente");
        Collections.reverse(notas);
        System.out.println(notas);

        System.out.println("Embaralhe e exiba a lista");
        Collections.shuffle(notas);
        System.out.println(notas);

        System.out.println("Substitua todas as notas por 3.0");
        Collections.fill(notas, 3.0);
        System.out.println(notas);
    }
}
