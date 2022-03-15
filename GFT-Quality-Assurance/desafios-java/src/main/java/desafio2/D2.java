package desafio2;

import java.io.IOException;
import java.util.Scanner;

public class D2 {
    public static void main(String[] args) throws IOException {
        // 7:10 = 10
        // 5:00 = 0
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            switch (hora) {
                case (7):
                    System.out.println("Atraso maximo: " + min);
                    break;
                case (8):
                    System.out.println("Atraso maximo: " + (60 + min));
                    break;
                case (9):
                    System.out.println("Atraso maximo: " + (120 + min));
                    break;
                default:
                    System.out.println("Atraso maximo: 0");
            }
        }
    }
}
