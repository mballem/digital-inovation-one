package me.dio.desafios.basicos;

import java.util.Scanner;

/**
 * Desafio
 * Neste desafio, você terá que criar uma função que faça um número como argumento e retorne
 * "Fizz", "Buzz" ou "FizzBuzz".
 * <p>
 * Entrada
 * Você receberá um número onde:
 * <p>
 * Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ;
 * <p>
 * Se o número for apenas múltiplo de 3 -> "Fizz" ;
 * <p>
 * Se o número for apenas múltiplo de 5 -> "Buzz";
 * <p>
 * Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido;
 * <p>
 * Saída
 * Retorne a palavra correta de acordo com o seu múltiplo.
 * Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme exemplo abaixo:
 * <p>
 * EXEMPLO DE ENTRADA   EXEMPLO DE SAÍDA
 * 3                    Fizz
 * 5                    Buzz
 * 15                   FizzBuzz
 * 4                    4
 */
public class D4 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        System.out.println(execute(num));
    }

    static String execute(int nun) {
        if (nun % 3 == 0 && nun % 5 == 0) return "FizzBuzz" ;
        if (nun % 3 == 0) return "Fizz";
        if (nun % 5 == 0) return "Buzz" ;
        return "" + nun;
    }
}
