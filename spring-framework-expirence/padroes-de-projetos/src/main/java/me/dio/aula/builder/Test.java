package me.dio.aula.builder;

import me.dio.aula.spring.gof.model.Endereco;

/**
 * Teste padrão Builder
 */
public class Test {
    public static void main(String[] args) {
        Endereco endereco = EnderecoBuilder.build()
                .cep("01001000")
                .siafi("7107")
                .uf("SP")
                .bairro("Sé")
                .complemento("lado impar")
                .ddd("11")
                .ibge("3550308")
                .logradouro("Praça da Sé")
                .gia("1004")
                .get();

        System.out.println(endereco);
    }
}
