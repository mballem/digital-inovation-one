package desafio2;

import java.util.Scanner;

public class D4 {
    public static void main(String[] args) {
        //6 = 1 2 3 6
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
}
