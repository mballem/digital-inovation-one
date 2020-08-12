package one.innovation.functional.aula2;

import java.util.function.Supplier;

public class Fornecedores {
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers1 = () -> new Pessoa();
        System.out.println(suppliers1.get());

        Supplier<Pessoa> suppliers2 = () -> new Pessoa(17);
        System.out.println(suppliers2.get());

        Supplier<Pessoa> suppliers3 = () -> new Pessoa("Bianca");
        System.out.println(suppliers3.get());

        Supplier<Pessoa> suppliers4 = () -> new Pessoa("Bruna", 20);
        System.out.println(suppliers4.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
    }

    public Pessoa(Integer idade) {
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
