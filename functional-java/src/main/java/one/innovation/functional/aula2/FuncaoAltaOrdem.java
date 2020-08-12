package one.innovation.functional.aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        System.out.println(executarOperacao(soma, 1, 3));

        Calculo somaComReferencia = Integer::sum;
        System.out.println(executarOperacao(somaComReferencia, 1, 3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.somar(a, b);
    }
}

interface Calculo {
    int somar(int a, int b);
}
