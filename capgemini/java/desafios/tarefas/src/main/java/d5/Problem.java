package d5;

import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double media = ((a * 3.5) + (b * 7.5)) / 11;


        System.out.println(String.format("MEDIA = %.5f" , media));
    }
}
