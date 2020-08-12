package one.innovation.functional.aula2;

/*
    Funcao alta ordem:
    - por parametro recebe outra função
    - ou uma função retorna outra função
 */
public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        System.out.println(executarOperacao(soma, 1, 3));

        Calculo somaComReferencia = Integer::sum;
        System.out.println(executarOperacao(somaComReferencia, 1, 3));

        Calculo subtracao = (a, b) -> a - b;
        System.out.println(executarOperacao(subtracao, 4, 3));

        Calculo multiplicacao = (a, b) -> a * b;
        System.out.println(executarOperacao(multiplicacao, 1, 3));

        Calculo divisao = (a, b) -> a / b;
        System.out.println(executarOperacao(divisao, 14, 2));
    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

interface Calculo {
    int calcular(int a, int b);
}
