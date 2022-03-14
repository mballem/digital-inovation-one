package desafio1;

import java.util.Scanner;

public class D4 {
    public static void main(String[] args) throws Exception {
        // 1
        // 1243 1243 - encaixa
        // 5678690 78690 - encaixa
        // 54 654 - nao encaixa
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        String a, b;

        for (int i = 0; i < count; i++) {
            //complete a resolução do problema com sua solução
            a = scan.next();
            b = scan.next();

            if (  a.endsWith(b)  ) System.out.println("encaixa");
            else System.out.println("nao encaixa");
        }

    }
}
