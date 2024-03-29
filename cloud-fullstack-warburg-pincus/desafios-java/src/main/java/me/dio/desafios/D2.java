package me.dio.desafios;

import java.util.Scanner;

/**
 * Descrição
 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados
 * da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
 * e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros,
 * que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem compradas
 * e os respectivos preços em 2 situações:
 *
 * Comprar apenas latas de 18 litros;
 * comprar apenas galões de 3,6 litros;
 * Entrada
 * A entrada consiste em um valor inteiro da área a ser pintada.
 *
 * Saída
 * A saída consiste em informar ao usuário as quantidades de tinta a serem compradas e os
 * respectivos preços, conforme o exemplo abaixo:
 *
 * Exemplo de Entrada	Exe
 * 100                  Quantidade(s) de lata(s) de tinta necessaria(s): 1 no valor R$ 80.0
 *                      Quantidade(s) de galao(oes) de tinta necessaria(s): 5 no valor R$ 125.0
 *
 * 500                  Quantidade(s) de lata(s) de tinta necessaria(s): 5 no valor R$ 400.0
 *                      Quantidade(s) de galao(oes) de tinta necessaria(s): 24 no valor R$ 600.0
 */
public class D2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaCoberta = scanner.nextDouble();
        double valorLata = 80;
        double valorGalao = 25;

        // total necessario em litros para a area a ser pintada
        double litros = areaCoberta / 6;

        System.out.println("area coberta: " + areaCoberta);
        System.out.println("Litros: "+ litros);

        double quantidadeLatas = Math.ceil( (litros) / 18 );
        System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * valorLata );

        double quantidadeGaloes = Math.ceil( (litros) / 3.6 );
        System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * valorGalao);
    }
}
