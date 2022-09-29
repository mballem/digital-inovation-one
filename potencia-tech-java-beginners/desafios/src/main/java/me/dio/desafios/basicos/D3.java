package me.dio.desafios.basicos;

import java.util.Scanner;

/**
 * Descrição
 * Neste desafio, receba um número inteiro N,
 * calcule e imprima o somatório de todos os números de N até 0.
 *
 * Entrada
 * A Entrada será composta por um número inteiro, N.
 *
 * Saída
 * Será  impresso o somatório de N até 0, como no exemplo a baixo:
 *
 * EXEMPLO DE ENTRADA   EXEMPLO DE SAÍDA
 * 10                   55
 * 4                    10
 * 15                   120
 */
public class D3 {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int N = numero.nextInt();
        int somatorio = somatorio(N);
        System.out.println(somatorio);
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
