package desafio1;

import java.io.IOException;
import java.util.Scanner;

public class D3 {

    public static void main(String[] args) throws IOException {
        //complete os espaços com sua solução
        // Entrada | Saida
        // 3       |
        // 3 -2    | -1.5
        // -8 0    | divisao impossivel
        // 0 8     | 0.0
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, Y;
        for (int i = 0; i < N; i++) {
            X = leitor.nextInt();
            Y = leitor.nextInt();
            if ( Y == 0 ) System.out.println("divisao impossivel");
            else System.out.printf("%.1f\n", (double) X / Y);
        }
    }

}
