package one.digitalinnovation.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Joana");
        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Fabiana");

        System.out.println(nomes);

        // ordenação da lista de nomes
        Collections.sort(nomes);

        System.out.println(nomes);

        // altera o elemento de indice 1 na lista ordenada de nomes
        nomes.set(1, "Vitória");

        System.out.println(nomes);

        // remove o indice 1 da lista ordenada de nomes
        nomes.remove(1);

        System.out.println(nomes);

        // remove o elemento "Pedro" da lista ordenada de nomes
        nomes.remove("Pedro");

        System.out.println(nomes);

        // Recupera o elemento de indice 1
        String nome = nomes.get(1);

        System.out.println(nome);

        // Recupera a quantidade de elementos da lista
        int tamanho = nomes.size();

        System.out.println(tamanho);

        // Verifica se elemento existe na lista de nomes
        boolean temJoana = nomes.contains("Joana");

        System.out.println(temJoana);

        boolean temPedro = nomes.contains("Pedro");

        System.out.println(temPedro);

        // Verifica se a lista tem ou não elementos
        boolean temElementos = nomes.isEmpty();

        System.out.println(temElementos);

        // Limpa a lista apagando os elementos
        nomes.clear();

        temElementos = nomes.isEmpty();

        System.out.println(temElementos);

        nomes = new ArrayList<>();
        nomes.add("Joana");
        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Fabiana");

        // percorre a lista e imprime os elementos
        for (String elemento : nomes) {
            System.out.println("--> " + elemento);
        }

        Collections.sort(nomes);

        // Percorre a lista já ordenada usando Itarator e while()
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("---> " + iterator.next());
        }
    }
}
