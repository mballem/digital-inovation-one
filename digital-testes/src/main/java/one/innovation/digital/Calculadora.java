package one.innovation.digital;

public class Calculadora {

    public int somar(String expressao) {
        int soma = 0;
        for (String valor : expressao.split("\\+")) {
            soma += Integer.parseInt(valor);
        }
        System.out.println(soma);
        return soma;
    }
}
