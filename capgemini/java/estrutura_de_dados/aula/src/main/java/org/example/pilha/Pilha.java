package org.example.pilha;

/**
 * Pilha do tipo LIFO (último que entra, primeiro que saí).
 */
public class Pilha {

    private Elemento referencia;

    public Pilha() {
        this.referencia = null;
    }

    /**
     * Retorna o primeiro elemento da pilha
     * @return primeiro elemento adicionado a pilha
     */
    public Elemento first() {
        Elemento temp = this.referencia;
        while (true) {
            if (temp != null) {
                if (temp.getReferencia() != null) {
                    temp = temp.getReferencia();
                } else {
                    break;
                }
            }
        }
        return temp;
    }

    /**
     * Remove o último elemento adicionado a pilha
     */
    public void pop() {
        if (!isEmpty()) {
            Elemento poped = this.referencia;
            this.referencia = this.referencia.getReferencia();
        }
    }

    /**
     * Adiciona um novo elemento ao final da pilha
     */
    public void push(Elemento elemento) {
        Elemento refTemp = this.referencia;
        this.referencia = elemento;
        this.referencia.setReferencia(refTemp);
    }

    /**
     * Retorna o último elemento da pilha (Topo)
     * @return último elemento adicionado a pilha
     */
    public Elemento top() {
        return referencia;
    }

    /**
     * Verifica se a referencia está nula
     * @return true se for nula / false se não for nula
     */
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
