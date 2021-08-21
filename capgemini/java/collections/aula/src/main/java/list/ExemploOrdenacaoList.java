package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>() {{
           add(new Gato("Jon", 18, "preto"));
           add(new Gato("Simba", 6, "tigrado"));
           add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println("Exibir a lista pela ordem de inserção:");
        System.out.println(gatos);

        System.out.println("Exibir a lista embaralhada:");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Exibir a lista ordenada por nome de a-z:");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Exibir a lista ordenada por nome de z-a:");
        Collections.reverse(gatos);
        System.out.println(gatos);

        System.out.println("Exibir a lista ordenada por idade de 0-9");
        gatos.sort(new ComparatorByIdade());
        System.out.println(gatos);

        System.out.println("Exibir a lista ordenada por cor de a-z");
        gatos.sort(new ComparatorByCor());
        System.out.println(gatos);

        System.out.println("Exibir a lista ordenada por nome > cor > idade");
        gatos.sort(new ComparatorByNomeCorIdade());
        System.out.println(gatos);

    }
}

class Gato implements Comparable<Gato> {

    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorByIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorByCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorByNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        int idade = Integer.compare(g1.getIdade(), g2.getIdade());
        if (idade != 0) return idade;

        return 0;
    }
}
