package me.dio.gft.banco.conta;

/**
 * Classe concreta para conta corrente
 */
public class ContaCorrente extends ContaImpl {

    @Override
    public void extrato() {
        System.out.println("\t=== Extrato Conta Corrente ===");
        super.imprimirDadosConta();
        System.out.println("\t============ FIM =============");
    }
}
