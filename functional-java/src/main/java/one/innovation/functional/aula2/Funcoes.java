package one.innovation.functional.aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornarNomeInverso = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornarNomeInverso.apply("Anelise"));

        Function<String, Integer> retornarInteiro = valor -> Integer.valueOf(valor);
        System.out.println(retornarInteiro.apply("80"));

        Function<String, Integer> retornarInteiroComReferencia = Integer::valueOf;
        System.out.println(retornarInteiro.apply("80"));
    }
}
