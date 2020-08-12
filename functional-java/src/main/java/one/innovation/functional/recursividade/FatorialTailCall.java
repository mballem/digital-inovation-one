package one.innovation.functional.recursividade;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println( fatorialA(5) );

        // gera erro de pilha por ser um valor muito grande
        System.out.println( fatorialA(50000) );
    }

    public static double fatorialA(double valor) {
        return fatorialTailCall(valor, 1);
    }

    public static double fatorialTailCall(double valor, double numero) {
        if (valor == 0) {
            return numero;
        }
        return fatorialTailCall(valor - 1, numero * valor);
    }
}
