package desafio2;

import java.util.Scanner;

public class D5 {
    public static void main(String[] args) {
        // 3 9 = 27
        // -30 10 = -300
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B; //implemente o código que representa a multiplicação.

        System.out.println("PROD = " + PROD);

        sc.close();

    }
}
