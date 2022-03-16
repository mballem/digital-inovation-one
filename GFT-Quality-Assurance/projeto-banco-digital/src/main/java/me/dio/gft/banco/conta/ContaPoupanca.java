package me.dio.gft.banco.conta;

/**
 * Classe concreta para conta poupanca
 */
public class ContaPoupanca extends ContaImpl {

    @Override
    public void extrato() {
        System.out.println("\n");
        System.out.println("\t=== Extrato Conta Poupanca ===");
        super.imprimirDadosConta();
        System.out.println("\t============ FIM =============");
    }
}
