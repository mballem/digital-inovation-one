package desafio1;

import java.io.IOException;
import java.util.Scanner;

public class D5 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        // 6 24 / multiplos
        // 6 25 / nao sao multiplos
        // 24 6 / multiplos
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        if (  a % b == 0 || b % a == 0  ) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
