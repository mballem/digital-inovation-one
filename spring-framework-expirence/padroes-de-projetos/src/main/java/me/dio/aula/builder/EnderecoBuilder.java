package me.dio.aula.builder;

import me.dio.aula.spring.gof.model.Endereco;

/**
 * Classe baseada no Padrão de Projetos Builder para
 * @see me.dio.aula.spring.gof.model.Endereco
 */
public class EnderecoBuilder {

    private Endereco endereco;

    private EnderecoBuilder() {
        this.endereco = new Endereco();
    }

    public static EnderecoBuilder build() {
        return new EnderecoBuilder();
    }

    /**
     * Adiciona cep ao objeto endereco
     * @param cep
     * @return retorna a instancia atual de EnderecoBuilder
     */
    public EnderecoBuilder cep(String cep) {
        this.endereco.setCep(cep);
        return this;
    }

    /**
     * Adiciona logradouro ao objeto endereco
     * @param logradouro
     * @return retorna a instancia atual de EnderecoBuilder
     */
    public EnderecoBuilder logradouro(String logradouro) {
        this.endereco.setLogradouro(logradouro);
        return this;
    }

    /**
     * Adiciona complemento ao objeto endereco
     * @param complemento
     * @return retorna a instancia atual de EnderecoBuilder
     */
    public EnderecoBuilder complemento(String complemento) {
        this.endereco.setComplemento(complemento);
        return this;
    }

    /**
     * Adiciona bairro ao objeto endereco
     * @param bairro
     * @return retorna a instancia atual de EnderecoBuilder
     */
    public EnderecoBuilder bairro(String bairro) {
        this.endereco.setBairro(bairro);
        return this;
    }

    /**
     * Adiciona uf ao objeto endereco
     * @param uf
     * @return retorna a instancia atual de EnderecoBuilder
     */
    public EnderecoBuilder uf(String uf) {
        this.endereco.setUf(uf);
        return this;
    }

    /**
     * Adiciona ibge ao objeto endereco
     * @param ibge
     * @return retorna a instancia atual de EnderecoBuilder
     */
    public EnderecoBuilder ibge(String ibge) {
        this.endereco.setIbge(ibge);
        return this;
    }

    /**
     * Adiciona ddd ao objeto endereco
     * @param ddd
     * @return retorna a instancia atual de EnderecoBuilder
     */
    public EnderecoBuilder ddd(String ddd) {
        this.endereco.setDdd(ddd);
        return this;
    }

    /**
     * Adiciona siafi ao objeto endereco
     * @param siafi
     * @return retorna a instancia atual de EnderecoBuilder
     */
    public EnderecoBuilder siafi(String siafi) {
        this.endereco.setSiafi(siafi);
        return this;
    }

    /**
     * Adiciona gia ao objeto endereco
     * @param gia
     * @return retorna a instancia atual de EnderecoBuilder
     */
    public EnderecoBuilder gia(String gia) {
        this.endereco.setGia(gia);
        return this;
    }

    /**
     * Recupera a instancia do objeto Endereco
     * @return objeto Endereco atual
     */
    public Endereco get() {
        return this.endereco;
    }
}
