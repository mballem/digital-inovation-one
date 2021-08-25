package org.example.generics;

public class PessoaEstrangeira {

    private String nome;

    public PessoaEstrangeira(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaEstrangeira{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
