package map;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Histório", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        System.out.println(livros);

        System.out.println("Imprimir na ordem aleatório apenas o nome do autor e do livro");
        for (Map.Entry<String, Livro> kv : livros.entrySet()) {
            System.out.println(kv.getKey() + " : " + kv.getValue().getNome());
        }

        System.out.println("Imprimir na ordem de inserção");
        livros = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Histório", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> kv : livros.entrySet()) {
            System.out.println(kv.getKey() + " : " + kv.getValue().getNome());
        }

        System.out.println("Imprimir em ordem alfabética dos autores");
        livros = new TreeMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Histório", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> kv : livros.entrySet()) {
            System.out.println(kv.getKey() + " : " + kv.getValue().getNome());
        }

        System.out.println("Imprimir na ordem alfabética dos nomes dos livros");
        Set<Map.Entry<String, Livro>> setLivros = new TreeSet<>(new ComparatorNome());
        setLivros.addAll(livros.entrySet());
        System.out.println(setLivros);
        for (Map.Entry<String, Livro> kv : setLivros) {
            System.out.println(kv.getKey() + " : " + kv.getValue().getNome());
        }
    }
}

class Livro {

    private String nome;
    private int paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (paginas != livro.paginas) return false;
        return nome != null ? nome.equals(livro.nome) : livro.nome == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + paginas;
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}