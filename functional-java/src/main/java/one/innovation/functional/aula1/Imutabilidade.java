package one.innovation.functional.aula1;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornoDobro = v -> v * 2;
        System.out.println(retornoDobro.apply(valor)); // retorna o dobro
        System.out.println(valor); // retorna o valor original
    }
}
