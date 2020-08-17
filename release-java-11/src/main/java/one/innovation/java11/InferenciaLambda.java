package one.innovation.java11;

import java.util.function.Function;

public class InferenciaLambda {

    public static void main(String[] args) {
        Function<Integer, Double> divisaoPorDois = (var numero) -> numero / 2.0;
        System.out.println(divisaoPorDois.apply(10));
    }
}
