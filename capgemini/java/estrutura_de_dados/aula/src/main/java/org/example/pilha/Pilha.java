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

    @Override
    public String toString() {
        String retorno = "--\t--\t--\t--\t--\t--\n";
        retorno += "\t\tPilha\n";
        retorno += "--\t--\t--\t--\t--\t--\n";

        Elemento temp = this.referencia;
        while (true) {
            if (temp != null) {
                retorno += "[Elemento{valor=" + temp.getValor() + "}]\n";
                temp = temp.getReferencia();
            } else {
                break;
            }
        }
        return retorno;
    }
}
