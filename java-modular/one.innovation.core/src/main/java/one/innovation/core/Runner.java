package one.innovation.core;

import one.innovation.utils.operacao.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.div(15, 3));
    }
}
