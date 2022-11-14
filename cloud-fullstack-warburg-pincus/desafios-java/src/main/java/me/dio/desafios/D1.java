package me.dio.desafios;

import java.util.*;

/**
 * Descrição
 * Faça um programa que solicite o nome do usuário e imprima-o de forma a mostrar
 * o nome em formato de escada.
 *
 * Entrada
 * A entrada consiste em uma string, sendo ela uma palavra.
 *
 * Saída
 * A saída deverá imprimir a palavra em formato de escada, letra por letra,
 * até se completar a palavra, conforme exemplo abaixo.
 *
 * Exemplo 1
 * Entrada	Saída
 *      	F
 *          FU
 *          FUL
 *          FULA
 *          FULAN
 *          FULANO
 */
public class D1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();

        String aux = "";
        for (Character c : palavra.toCharArray()) {
            aux += c;
            System.out.println(aux);
        }

    }
}
