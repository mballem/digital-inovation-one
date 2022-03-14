package desafio1;

import java.util.Scanner;

public class D2 {

    public static void main(String[] args) {
        //E1 = 30; E2 = 10; SOMA = 40
        Scanner sc = new Scanner (System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;  //insira as variáveis corretamente

        System.out.println("SOMA = " + soma);

        sc.close();

    }
}
