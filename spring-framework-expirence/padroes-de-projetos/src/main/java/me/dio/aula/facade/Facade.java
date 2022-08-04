package me.dio.aula.facade;

import me.dio.aula.facade.subsistema1.crm.CrmService;
import me.dio.aula.facade.subsistema2.cep.CepApi;

public class Facade {

    public void migrar(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravar(nome, cep, cidade, estado);
    }

    public static void main(String[] args) {
        new Facade().migrar("Nome 1", "Cep 1");
    }
}
