package org.example.generics;

public class Pessoa {
    enum DocumentoTipo {
        CPF, CNPJ
    }

    private String nome;
    private DocumentoTipo tipo;
    private String documentoNumero;

    public Pessoa(String nome, DocumentoTipo tipo, String documentoNumero) {
        this.nome = nome;
        this.tipo = tipo;
        this.documentoNumero = documentoNumero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", documentoNumero='" + documentoNumero + '\'' +
                '}';
    }
}
