package codigo_basico;

import java.util.Scanner;

/**
 * Desafio
 * Faça um programa que leia um valor T e
 * preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes,
 * conforme exemplo abaixo. Imprima o vetor N.
 * <p>
 * Entrada
 * A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
 * <p>
 * Saída
 * Para cada posição do vetor, escreva "N[i] = x",
 * onde i é a posição do vetor e x é o valor armazenado naquela posição.
 * <p>
 * Exemplo de Entrada	Exemplo de Saída
 * 3                    N[0] = 0
 * N[1] = 1
 * N[2] = 2
 * N[3] = 0
 * N[4] = 1
 * N[5] = 2
 * ...
 */
public class D3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

        // TODO: Implemente uma condição onde possamos preencher o vetor de N.
        // Lembre-se a sequência de valores é de 0 até T-1:
        int[] N = new int[1000];

        int cont = 0;
        while (cont < N.length - 1) {
            for (int j = 0; j < t; j++) {
                N[cont] = j;
                cont++;
            }
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
