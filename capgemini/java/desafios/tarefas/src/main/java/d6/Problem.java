package d6;

import java.util.Scanner;

/**
 * Classe de execução da tarefa 6
 */
public class Problem {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}