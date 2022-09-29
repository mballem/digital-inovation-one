package me.dio.desafios.basicos;

import java.util.Scanner;

/**
 * Desafio
 * Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
 *
 * Entrada
 * A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.
 *
 * Saída
 * A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
 *
 * Exemplo 1
 * Entrada	Saída
 * 5        50
 * 20
 *
 * Exemplo 2
 *
 * Entrada	Saída
 * 3        63
 * 18
 */
public class D2 {

    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int soma = 0, mult = 0;
        for (int i = 1; mult < N; i++) {
            mult = A * i;
            soma = soma + mult;
        }
        System.out.println(soma);
    }
}
