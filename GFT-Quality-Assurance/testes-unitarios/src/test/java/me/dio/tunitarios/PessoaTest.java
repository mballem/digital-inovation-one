package me.dio.tunitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    @Test
    void validaIdadePessoa() {
        Pessoa pessoa = new Pessoa("Joey", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(22, pessoa.getIdade());
    }

    @Test
    void validaVerificacaoMaiorIdade() {
        Pessoa pessoa = new Pessoa("Joey", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(pessoa.isMaiorIdade());

        pessoa = new Pessoa("Jimmy", LocalDate.now());
        Assertions.assertFalse(pessoa.isMaiorIdade());
    }
}