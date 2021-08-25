package org.example.no;

public class NoGenerico<T> {

    private T conteudo;
    private NoGenerico<T> proximo;

    public NoGenerico(T conteudo) {
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoGenerico<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoGenerico<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
