package desafio1;

import java.util.Scanner;

public class D1 {

    public static void main(String[] args) {
        // E: 30 / S: 60 minutos
        // E: 110 / S: 220 minutos
        int minutos;
        Scanner input = new Scanner(System.in);
        minutos = input.nextInt();
        int K = minutos * 2;
        System.out.printf("%d minutos\n", K);
    }
}

