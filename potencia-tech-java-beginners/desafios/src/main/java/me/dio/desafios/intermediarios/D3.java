package me.dio.desafios.intermediarios;

import java.util.Scanner;

/**
 * Desafio
 * Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n.
 * Um quadrado perfeito é um inteiro que é o quadrado de um inteiro;
 * em outras palavras, é o produto de algum inteiro consigo mesmo.
 * Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.
 * <p>
 * Entrada
 * A entrada consiste em um número inteiro n, representando o valor total.
 * <p>
 * Saída
 * A saída consiste em retornar o menor número de números quadrados perfeitos.
 * <p>
 * <p>
 * <p>
 * EXEMPLO DE ENTRADA   EXEMPLO DE SAÍDA
 * 12                   3
 * 13                   2
 * 10                   2
 * 21                   3
 */
public class D3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int[] d = new int[n + 1];

        // adicionar no array os quadrados perfeitos <= N
        for (int i = 0; i < d.length; i++) {
            int quad = i * i;
            if (quad <= n) {
                d[i] = quad;
            } else break;
        }

        int total = n;
        for (int i = d.length - 1; (i >= 1 && i <= n); i--) {
            if (d[i] > 0) {
                int temp = n;
                int cont = 0;
                for (int j = i; j > 0; j--) {
                    while (temp > 0) {
                        int quad = d[j];
                        if (temp >= quad) {
                            temp = temp - quad;
                            cont = cont + 1;
                        } else {
                            j = j - 1;
                        }
                    }
                }
                total = Math.min(total, cont);
            }
        }
        System.out.println(total);
    }
}
