package org.example.pilha;

public class Pilha {

    private Elemento referencia;

    public Pilha() {
        this.referencia = null;
    }

    public Elemento pop() {
        if (!isEmpty()) {
            Elemento poped = this.referencia;
            this.referencia = this.referencia.getReferencia();
            return poped;
        }
        return null;
    }

    public void push(Elemento elemento) {
        Elemento refTemp = this.referencia;
        this.referencia = elemento;
        this.referencia.setReferencia(refTemp);
    }

    public Elemento top() {
        return referencia;
    }

    public boolean isEmpty() {
        return referencia == null;
    }
}
