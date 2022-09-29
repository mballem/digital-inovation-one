package me.dio.desafios.basicos;

import java.util.*;

/**
 * Desafio
 * Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”.
 * Caso contrário, retorne "Nao sao iguais!” sem as aspas.
 * <p>
 * Entrada
 * As entradas serão dois valores, um em cada linha, representados por A e B,
 * que sempre serão números inteiros.
 * <p>
 * Saída
 * A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,
 * retorne "Nao sao iguais!", sem as aspas.
 * <p>
 * EXEMPLO DE ENTRADA   EXEMPLO DE SAÍDA
 * 1                    Nao sao iguais!
 * 2
 * <p>
 * 50                   Sao iguais!
 * 50
 */
public class D1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        if (a == b) System.out.println("Sao iguais!");
        else System.out.println("Nao sao iguais!");
    }
}
