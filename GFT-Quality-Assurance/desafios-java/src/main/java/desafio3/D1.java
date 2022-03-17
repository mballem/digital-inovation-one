package desafio3;

import java.util.*;

/**
 * Receba como entrada um inteiro com a quantidade de linhas a serem lidas
 * Cada linha deve ser um inteiro não negativo
 * Ordene os valores pares de forma crescente e os impares de forma decrescente
 * Imprima primeiro os pares e depois os impares com um numero em cada linha
 */
public class D1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int size = leitor.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int n = leitor.nextInt();
            if (n % 2 == 0) pares.add(n);
            else impares.add(n);
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        pares.forEach(System.out::println);
        impares.forEach(System.out::println);
    }
}
