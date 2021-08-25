package org.example.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bia", "Cleo", "Duda", "Fabi");
        imprimeLista(nomes);

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        imprimeLista(numeros);

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CPF, "00000010"),
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CPF, "00000020"),
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CPF, "00000030"),
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CNPJ, "000000-40"),
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CNPJ, "000000-80")
        );
        imprimeLista(pessoas);
        imprimeListaHeranca(pessoas);

        List<Pessoa> pf = Arrays.asList(
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CPF, "00000010"),
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CPF, "00000020"),
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CPF, "00000030")
        );
        imprimeListaHeranca(pf);

        List<Pessoa> pj = Arrays.asList(
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CNPJ, "000000-40"),
                new Pessoa("Ana Pires", Pessoa.DocumentoTipo.CNPJ, "000000-80")
        );
        imprimeListaHeranca(pj);

        List<PessoaEstrangeira> extrangeiros = Arrays.asList(
                new PessoaEstrangeira("Hebert Johnson"),
                new PessoaEstrangeira("Jones Gral")
        );
        //imprimeListaHeranca(extrangeiros);

    }

    static void imprimeLista(List<?> lista) {
        System.out.println(lista);
    }

    static void imprimeListaHeranca(List<? extends Pessoa> lista) {
        System.out.println(lista);
    }

}
