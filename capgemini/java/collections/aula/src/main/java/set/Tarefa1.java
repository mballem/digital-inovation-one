package set;

import java.util.*;

public class Tarefa1 {

    public static void main(String[] args) {
        Set<String> arcoIris = new LinkedHashSet<>();
        arcoIris.add("vermelho");
        arcoIris.add("laranja");
        arcoIris.add("amarelo");
        arcoIris.add("verde");
        arcoIris.add("azul");
        arcoIris.add("anil");
        arcoIris.add("violeta");

        System.out.println("A. Exiba todas as cores do conjunto, uma abaixo da outra:");
        exibirCores(arcoIris);

        System.out.println("B. Exiba a quantidade de cores do conjunto arco-iris: ");
        totalDeCores(arcoIris);

        System.out.println("C. Exiba as cores em ordem alfabética: ");
        ordenacaoCrescente(arcoIris);

        System.out.println("D. Exiba as cores na ordem inversa que foi informada: ");
        ordemReversa(arcoIris);

        System.out.println("E. Exiba todas as cores que começam com 'V': ");
        coresIniciadasComV(arcoIris);

        System.out.println("F. Remova as cores que não começam com 'V': ");
        removerCoresNaoIniciadasPorV(arcoIris);
        exibirCores(arcoIris);

        System.out.println("G. Limpe o conjunto arco-iris");
        arcoIris.clear();
        System.out.println("H. Conjunto está vazio: " + arcoIris.isEmpty());
    }

    static void limparConjunto(Set<String> values) {
        values.clear();
    }

    static void removerCoresNaoIniciadasPorV(Set<String> values) {
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) {
                iterator.remove();
            }
        }
    }

    static void coresIniciadasComV(Set<String> values) {
        for (String value : values) {
            if (value.startsWith("v")) {
                System.out.println(value);
            }
        }
    }

    static void ordemReversa(Set<String> values) {
        List<String> list = new ArrayList<>(values);
        Collections.reverse(list);
        System.out.println(list);
    }

    static void ordenacaoCrescente(Set<String> values) {
        System.out.println(new TreeSet<>(values));
    }

    static void exibirCores(Set<String> values) {
        for (String value : values) {
            System.out.println(value);
        }
    }

    static void totalDeCores(Set<String> values) {
        System.out.println(values.size());
    }

}
