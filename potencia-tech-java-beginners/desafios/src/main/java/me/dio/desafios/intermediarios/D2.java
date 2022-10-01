package me.dio.desafios.intermediarios;

import java.util.Scanner;

/**
 * Desafio
 * Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']'
 * determine se uma determinada string é válida.
 *
 * Entrada
 * Uma string é considerada válida se:
 *
 * Caracteres de abertura devem ser fechadas pelo mesmo tipo.
 * Abertura devem ser fechados com uma chave correspondente.
 * Uma string vazia é considerada válida.
 *
 * Saída
 * A saída corresponde a um valor Booleano como no exemplo abaixo:
 *
 * Entrada	    Saída
 * []           true
 * ()           true
 * [)           false
 */
public class D2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        String s1 = String.valueOf(s.charAt(0));
        String s2 = String.valueOf(s.charAt(1));
        if (s1.equals("[") && s2.equals("]")) return true;
        if (s1.equals("(") && s2.equals(")")) return true;
        return false;
    }
}
