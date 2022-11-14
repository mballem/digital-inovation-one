package me.dio.desafios;

import java.util.Scanner;

/**
 * Desafio
 * Faça um Programa que peça um número correspondente a um determinado ano e
 * em seguida informe se este ano é ou não bissexto
 *
 * Entrada
 * A entrada consiste em um valor inteiro referente ao ano solicitado.
 *
 * Saída
 * A saída deverá retornar se o ano será bissexto ou não, conforme exemplo abaixo:
 *
 * Exemplo 1
 *
 * Entrada	Saída
 * 1992	    Bissexto
 * Exemplo 2
 *
 * Entrada	Saída
 * 2021	    Nao Bissexto
 */
public class D5 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano;

        ano = ent.nextInt();

        //TODO: Descubra se o ano é bissexto ou não

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("Bissexto");
                } else {
                    System.out.println("Nao Bissexto");
                }
            } else {
                System.out.println("Bissexto");
            }
        } else {
            System.out.println("Nao Bissexto");
        }
    }
}
