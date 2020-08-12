package one.innovation.functional.aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        Consumer<String> imprimeUmaFrase = frase -> System.out.println(frase);
        imprimeUmaFrase.accept("Olá Mundo Java Lambda!");

        Consumer<String> imprimeUmaFrasePorReferencia = System.out::println;
        imprimeUmaFrasePorReferencia.accept("Olá Mundo Java Lambda com Referencia!");
    }
}
