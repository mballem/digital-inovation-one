package set;

import java.util.*;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {
        Set<Serie> series = new HashSet<>(Arrays.asList(
                new Serie("Heroes", "Ficção", 45),
                new Serie("Lost", "Suspense", 55),
                new Serie("Avatar", "Aventura", 60)
        ));
        System.out.println("Exibir a lista na ordem natural:\n" + series);

        series = new LinkedHashSet<>(Arrays.asList(
                new Serie("Heroes", "Ficção", 45),
                new Serie("Lost", "Suspense", 55),
                new Serie("Avatar", "Aventura", 60)
        ));
        System.out.println("Exibir a lista na ordem de inserção:\n" + series);

        series = new TreeSet<>(Arrays.asList(
                new Serie("Heroes", "Ficção", 45),
                new Serie("Lost", "Suspense", 45),
                new Serie("Avatar", "Aventura", 60)
        ));
        System.out.println("Exibir a lista na ordem crescente:\n" + series);

    }
}

class Serie implements Comparable<Serie> {

    private String nome;
    private String genero;
    private int tempo;

    public Serie(String nome, String genero, int tempo) {
        this.nome = nome;
        this.genero = genero;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpsodio=" + tempo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Serie serie = (Serie) o;

        if (tempo != serie.tempo) return false;
        if (nome != null ? !nome.equals(serie.nome) : serie.nome != null) return false;
        return genero != null ? genero.equals(serie.genero) : serie.genero == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (genero != null ? genero.hashCode() : 0);
        result = 31 * result + tempo;
        return result;
    }

    @Override
    public int compareTo(Serie serie) {
        return this.getNome().compareToIgnoreCase(serie.getNome());
    }
}