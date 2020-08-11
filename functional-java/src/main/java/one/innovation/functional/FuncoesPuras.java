package one.innovation.functional;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        // funcoes puras
        BiPredicate<Integer, Integer> verificaSeEMaior = (parametro, valorComposicao) -> parametro > valorComposicao;

        System.out.println(verificaSeEMaior.test(13,12));
        System.out.println(verificaSeEMaior.test(13,12));
    }
}
