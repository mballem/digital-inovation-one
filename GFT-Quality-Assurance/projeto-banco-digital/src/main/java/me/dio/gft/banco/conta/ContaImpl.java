package me.dio.gft.banco.conta;

/**
 * Implementacao da interfa Conta
 */
public abstract class ContaImpl implements Conta {

    private static final int AGENCIA_PADRAO = 99;
    private static int sequencial = 1;

    protected int agencia;
    protected int numero;
    private double saldo;

    /**
     * Cria a conta com a agendia padrao 99
     * Cada nova conta criada sera o numero anterior +1
     */
    public ContaImpl() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = sequencial++;
    }

    /**
     *
     * @return int com o numero da agencia
     */
    @Override
    public int getAgencia() {
        return agencia;
    }

    /**
     *
     * @return int com o numero da conta corrente ou poupanca
     */
    @Override
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @return valor do saldo atual da conta
     */
    @Override
    public double getSaldo() {
        return saldo;
    }

    /**
     * Recebe o valor do saque como parametro.
     * Caso o valor do saque seja maior que o saldo
     * a operacao de saque nao sera realizada e
     * uma mensagem de saldo insuficiente exibida ao usuario.
     * @param valor valor a ser sacado
     */
    @Override
    public void sacar(double valor) {
        if (valor > this.saldo) System.out.println("\tSaldo insuficiente: " + this.saldo);
        else this.saldo -= valor;
    }

    /**
     * Recebe o valor do deposito como parametro e
     * atualiza o saldo atual
     * @param valor valor referente ao deposito
     */
    @Override
    public void deposito(double valor) {
        this.saldo += valor;
    }

    /**
     * Recebe o valor da transferencia como parametro.
     * A transferencia so sera realizada caso exista
     * saldo suficiente.
     * @param valor valor da transferencia
     * @param destino conta destino da transferencia
     */
    @Override
    public void transferencia(double valor, Conta destino) {
        this.sacar(valor);
        destino.deposito(valor);
    }

    /**
     * Imprime o extrado da conta
     */
    protected void imprimirDadosConta() {
        System.out.printf("\tAgencia: %d%n", this.agencia);
        System.out.printf("\tConta..: %d%n", this.numero );
        System.out.printf("\tSaldo..: %.2f%n", this.saldo);
    }
}
