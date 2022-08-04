package me.dio.aula.facade.subsistema2.cep;

@SuppressWarnings("ALL")
public class CepApi {

    private static final CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Cidade recuperada";
    }

    public String recuperarEstado(String cep) {
        return "Estado recuperada";
    }
}
