package me.dio.aula.facade.subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravar(String nome, String cep, String cidade, String estado) {
        System.out.printf("Cliente salvo no sistema de CRM: %s; %s; %s; %s.", nome, cep, cidade, estado);

    }
}
