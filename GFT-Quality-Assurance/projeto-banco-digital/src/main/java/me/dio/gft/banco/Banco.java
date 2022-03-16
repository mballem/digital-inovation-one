package me.dio.gft.banco;

import me.dio.gft.banco.conta.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe banco.
 * Armazena a lista de contas
 */
public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    /**
     *
     * @return retorna List<Conta> se houver elementos,
     * caso contrário retorna lista vazia.
     */
    public List<Conta> getContas() {
        return contas;
    }

    /**
     * Localiza uma conta pela agencia e numero.
     * @param agencia numero da agencia
     * @param numero numero da conta
     * @return Conta caso se localizada na lista e
     * null caso nao exista na lista de contas
     */
    public Conta buscarConta(int agencia, int numero) {
        List<Conta> collect = contas.stream()
                .filter(c -> c.getAgencia() == agencia && c.getNumero() == numero)
                .collect(Collectors.toUnmodifiableList());
        return collect.isEmpty() ? null : collect.get(0);
    }
}
