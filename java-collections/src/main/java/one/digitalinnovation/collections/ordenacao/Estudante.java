package one.digitalinnovation.collections.ordenacao;

public class Estudante implements Comparable<Estudante> {

    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    // compara as idades de cada estudante para ordenacao na lista
    // (+) a idade atual é maior que a que está sendo comparada
    // (-) a idade atual é menor que a que está sendo comparada
    // (0) as idades são identicas
    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
}
