package one.digitalinnovation.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExempleMap {

    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", "Silva", 25),
                new Pessoa("Carla", "Lima", 29),
                new Pessoa("Mara", "Ramos", 20)
        );

        Map<String, Object> map = pessoas.stream().collect(Collectors.toMap(Pessoa::getNome, Pessoa::getSobrenome));

        System.out.println(map);

        Map<String, Pessoa> map2 = pessoas.stream().collect(Collectors.toMap(Pessoa::getNome, Function.identity()));

        System.out.println(map2);
    }
}

class Pessoa {

    String nome;
    String sobrenome;
    int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}