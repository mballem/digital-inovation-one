package desafio3;

import java.util.Scanner;
/*
Entrada
A entrada contém vários casos de teste. Cada caso contém uma linha com o número N (1 ≤ N ≤ 106).
É garantido que o valor de N é tal que é possível obter exatamente N cópias de um ninja utilizando a técnica
(incluindo o original).

Saída
Para cada caso de teste, imprima uma linha contendo o número de vezes que a técnica foi utilizada.


Exemplo de Entrada	Exemplo de Saída
1                       0
2                       1
4                       2
 */
public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int clones = sc.nextInt();

            if (clones == 1) System.out.println(0);
            else if (clones == 2) System.out.println(1);
            else System.out.println(clones / 2);
        }
        sc.close();
    }
}

