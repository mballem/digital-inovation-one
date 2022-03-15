package desafio2;

import java.io.IOException;
import java.util.Scanner;

public class D1 {
    public static void main(String[] args) throws IOException {
        //5.0  7.1 = 6.43182
        //0.0  7.1 = 4.84091
        //10.0 10.0 = 10.00000
        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double media = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.println(String.format("MEDIA = %.5f" , media));
    }
}
