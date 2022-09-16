package codigo_basico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Desafio
 * Neste problema, deve-se ler:
 * <p>
 * O código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1.
 * O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 * Após, calcule e mostre o valor a ser pago.
 * <p>
 * Entrada
 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
 * respectivamente dois inteiros e um valor com 2 casas decimais.
 * <p>
 * Saída
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
 * O valor deverá ser apresentado com 2 casas após o ponto.
 * <p>
 * Exemplo 1:
 * <p>
 * Exemplos de Entrada	Exemplos de Saída
 * 12 1 5.30            VALOR A PAGAR: R$ 15.50
 * 16 2 5.10
 * <p>
 * Exemplo 2:
 * <p>
 * Exemplos de Entrada	Exemplos de Saída
 * 13 2 15.30           VALOR A PAGAR: R$ 51.40
 * 161 4 5.20
 * <p>
 * Exemplo 3:
 * <p>
 * Exemplos de Entrada	Exemplos de Saída
 * 1 1 15.10            VALOR A PAGAR: R$ 30.20
 * 2 1 15.10
 */
public class D2 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double total = 0.0;
        while ( leitor.hasNext() ) {
            int cod1 = leitor.nextInt();
            int n1 = leitor.nextInt();
            double valor1 = leitor.nextDouble();
            total = total + (n1 * valor1);
        }
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}
