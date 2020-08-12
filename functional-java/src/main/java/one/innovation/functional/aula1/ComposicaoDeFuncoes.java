package one.innovation.functional.aula1;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4};

        // Funcional
        Arrays.stream(valores)
                .filter(n -> n % 2 == 0) // se n for par
                .map(n -> n * 2) // multiplica n por 2
                .forEach(n -> System.out.println("Functional: " + n)); // imprime n quando par

        // Imperative
        for (int i = 0; i < valores.length; i++) {
            int n = 0;
            if (valores[i] % 2 == 0) {
                n = valores[i] * 2;
                if (n != 0) {
                    System.out.println("Imperative: " + n);
                }
            }
        }
    }
}
