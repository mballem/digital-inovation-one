package me.dio.desafios.basicos;

import java.util.Scanner;

/**
 * Desafio
 * Uma busca sequencial se caracteriza por percorrermos todos os  elementos de uma estrutura em busca do elemento “X” desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X. Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso.
 * <p>
 * Considere um array de 10 elementos do tipo inteiro:
 * <p>
 * Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.
 * <p>
 * ● Implemente uma classe em Java que aloque e carregue esses elementos em um array.
 * <p>
 * ● Implementação da busca sequencial:
 * <p>
 * ● Crie um método em Java que realiza uma busca sequencial.
 * <p>
 * ● Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array.
 * Caso contrario retorne um texto dizendo que o número não foi encontrado, conforme exemplos abaixo.
 * <p>
 * <p>
 * <p>
 * Entrada
 * A entrada consiste em um valor de busca e/ou array
 * <p>
 * Saída
 * A saída será a a posição do elemento no array, caso o valor não se encontre na Array,
 * retorne a frase " Numero __ nao encontrado!", como no exemplo abaixo:
 * <p>
 * EXEMPLO DE ENTRADA   EXEMPLO DE SAÍDA
 * 81                   Achei 81 na posicao 5
 * 10                   Achei 10 na posicao 8
 * -16                  Achei –16 na posicao 2
 * 4                    Numero 4 nao encontrado!
 */
public class D5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        boolean achei = false;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == num) {
                encontrado(num, i);
                achei = true;
            }
        }

        if (!achei) {
            naoEncontrado(num);
        }
    }

    static void encontrado(int num, int pos) {
        System.out.printf("Achei %s na posicao %s", num, pos);
    }

    static void naoEncontrado(int num) {
        System.out.printf("Numero %s nao encontrado! ", num);
    }
}
