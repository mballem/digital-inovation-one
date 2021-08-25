package org.example.fila;

/**
 * FIFO (primeiro que entra, primeiro que sai)
 */
public class Fila {
    private Elemento referencia;

    public Fila() {
        this.referencia = null;
    }

    /**
     * Enfileirar novos elementos (entrada de elemento)
     * @param elemento
     */
    public void enqueue(Elemento elemento) {
        elemento.setElemento(referencia);
        referencia = elemento;
    }

    /**
     * Captura o primeiro elemento da fila
     * @return primeiro Elemento
     */
    public Elemento first() {
        if (!this.isEmpty()) {
            Elemento primeiroNo = referencia;
            while (true) {
                if (primeiroNo.getElemento() != null) {
                    primeiroNo = primeiroNo.getElemento();
                } else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    /**
     * Desenfileira a fila, ou seja, remove o elemento a sai da fila
     * @return Elemento / elemento removido, primeiro elemento da fila
     */
    public Elemento dequeue() {
        if (!this.isEmpty()) {
            Elemento primeiroNo = referencia;
            Elemento noAuxiliar = referencia;
            while (true) {
                if (primeiroNo.getElemento() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getElemento();
                } else {
                    noAuxiliar.setElemento(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    /**
     * Verifica se refrencia está nula
     * @return true/false
     */
    public boolean isEmpty() {
        return referencia == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        Elemento noAuxiliar = referencia;

        if (referencia != null) {
            while (true) {
                stringRetorno += "[Elemento{objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getElemento() != null) {
                    noAuxiliar = noAuxiliar.getElemento();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
