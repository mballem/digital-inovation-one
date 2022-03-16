package me.dio.gft.banco.conta;

/**
 * Interface de contas do banco digital
 */
public interface Conta {

    void sacar(double valor);

    void deposito(double valor);

    void transferencia(double valor, Conta destino);

    void extrato();

    int getAgencia();

    int getNumero();

    double getSaldo();
}
