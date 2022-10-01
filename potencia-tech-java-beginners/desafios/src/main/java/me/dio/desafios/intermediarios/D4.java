package me.dio.desafios.intermediarios;

import java.util.*;

/**
 * Desafio
 * Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os
 * inteiros ímpares.
 * <p>
 * Retorne qualquer array que satisfaça essa condição.
 * <p>
 * <p>
 * Entrada
 * A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array.
 * As linhas seguintes deverão conter os valores que esse array receberá.
 * <p>
 * Saída
 * A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares,
 * conforme exemplo abaixo:
 * <p>
 * Exemplo 1
 * <p>
 * Entrada	Saída
 * 4        2
 * 3        4
 * 1        3
 * 2        1
 * 4
 * <p>
 * Exemplo 1
 * <p>
 * Entrada	Saída
 * 1        0
 * 0
 */
public class D4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int[] nums = new int[N];
        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        for (i = 0; i < N; i++) {
            if (nums[i] % 2 != 0) {
                for (int j = (i + 1); j < N; j++) {
                    if (nums[j] % 2 == 0) {
                        int impar = nums[i];
                        int par = nums[j];
                        nums[i] = par;
                        nums[j] = impar;
                        break;
                    }
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
