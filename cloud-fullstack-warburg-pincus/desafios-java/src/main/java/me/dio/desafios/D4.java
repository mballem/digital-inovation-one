package me.dio.desafios;

import java.util.Scanner;

/**
 * Desafio
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um
 * link de Internet (em Mbps). Calcule e informe o tempo aproximado de download do arquivo usando este
 * link (em minutos).
 * <p>
 * Entrada
 * Você receberá duas entradas que representam o tamanho do arquivo para download em MB e a velocidade
 * de um link para Internet em Mbps.
 * <p>
 * Saída
 * A saída será o tempo aproximado de download do arquivo em minutos.
 * <p>
 * Entrada	Saída
 * 159      0.01
 * 200
 * <p>
 * 80       0.02
 * 60
 * <p>
 * 30       0.01
 * 60
 */
public class D4 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        double tmhMB = sc.nextFloat();
        double tmhMbps = sc.nextFloat();

        //TODO: Calcule o tempo aproximado de download:
        double tempo = ( ( tmhMB / (tmhMbps / 8) ) / 60 ) / 10;

        //TODO: Imprima o calculo do tempo, leve em consideração que a saída é um numero com duas casas decimais:
        System.out.printf("%.2f", tempo);
    }
}
