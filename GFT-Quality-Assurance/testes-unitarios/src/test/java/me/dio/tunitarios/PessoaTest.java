package me.dio.tunitarios;

import me.dio.tunitarios.exception.NomeTamanhoInvalidoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    @Test
    void validaExcecaoComprimentoNomeInvalido() {
        Pessoa pessoa =  new Pessoa("",
                LocalDate.of(2000,1,1),
                "Filmes", "Futebol", "Música");

        Assertions.assertThrows(NomeTamanhoInvalidoException.class, pessoa::isNomeValido);

        pessoa =  new Pessoa("Josivaldo Orlanado da Silva Gomes de Oliveira Andrade Neto",
                LocalDate.of(2000,1,1),
                "Filmes", "Futebol", "Música");

        Assertions.assertThrows(NomeTamanhoInvalidoException.class, pessoa::isNomeValido);
    }

    @Test
    void validaComprimentoDoNome() {
        Pessoa pessoa =  new Pessoa("Joey",
                LocalDate.of(2000,1,1),
                "Filmes", "Futebol", "Música");

        Assertions.assertTrue(pessoa.isNomeValido());
    }

    @Test
    void validaSeHobbyExiste() {
        Pessoa pessoa =  new Pessoa("Joey",
                LocalDate.of(2000,1,1),
                "Filmes", "Futebol", "Música");

        Assertions.assertEquals("Futebol", pessoa.getHobby("Futebol"));

        Assertions.assertNotEquals("Anime", pessoa.getHobby("Anime"));
    }

    @Test
    void validaTotalDeHobbies() {
        Pessoa pessoa =  new Pessoa("Joey",
                LocalDate.of(2000,1,1),
                "Filmes", "Futebol", "Música");

        Assertions.assertEquals(3, pessoa.totalDeHobbies());
    }

    @Test
    void validaHobbies() {
        Pessoa pessoa =  new Pessoa("Joey",
                LocalDate.of(2000,1,1),
                "Filmes", "Futebol", "Música");

        Assertions.assertArrayEquals(new String[] {"Filmes", "Futebol", "Música"}, pessoa.getHobbies());
    }

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