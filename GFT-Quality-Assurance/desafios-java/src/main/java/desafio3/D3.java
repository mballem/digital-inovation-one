package desafio3;

import java.util.Scanner;
/*// Combinação de strings

/* Crie um algoritmo que receba dois inputs que sejam strings e combine-as
alternando as letras de cada string.
Deve começar pela primeira letra da primeira string, seguido pela primeira
letra da segunda string, em seguida pela segunda letra da primeira string e
continuar dessa forma sucessivamente.
As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string
resultante e retornada.

- Entrada
A entrada contém vários casos de teste. A primeira linha contém um inteiro N
que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste
é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de
caracteres contém entre 1 e 50 caracteres inclusive.

- Saída

Combine as duas cadeias de caracteres da entrada como mostrado no exemplo
abaixo e exiba a cadeia resultante.
*/
public class D3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N =leitor.nextInt();

        for (int i = 0; i < N; i++) {
            String s1 = leitor.next();
            String s2 = leitor.next();

            String resultado = "";
            for (int j = 0; j < s1.length(); j++) {
                try {
                    resultado += String.valueOf(s1.charAt(j)) + String.valueOf(s2.charAt(j));
                }catch (Exception e){
                    resultado += String.valueOf(s1.charAt(j));
                }
            }

            if(s2.length() > s1.length()) {
                int qtde = s2.length() - s1.length();

                for (int t = s2.length() - qtde; t < s2.length(); t++) {
                    resultado += String.valueOf(s2.charAt(t));
                }
            }
            System.out.println(resultado);
        }

    }
}
