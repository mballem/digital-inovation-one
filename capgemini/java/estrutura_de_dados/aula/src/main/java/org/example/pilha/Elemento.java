package org.example.pilha;

public class Elemento {

    private int valor;
    private Elemento referencia = null;

    public Elemento(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento getReferencia() {
        return referencia;
    }

    public void setReferencia(Elemento referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "valor=" + valor +
                '}';
    }
}
