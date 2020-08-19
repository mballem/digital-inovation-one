package one.innovation.demorestfull.service;

import one.innovation.demorestfull.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e Flecha");
        return soldado;
    }

    public void criarSoldado(Soldado soldado) {

    }

    public void alterarSoldado(String cpf, Soldado soldado) {

    }

    public void excluirSoldado(String cpf) {

    }

    public List<Soldado> buscarTodos() {
        return List.of(
                new Soldado("40506080", "Anali", "Elfo", "Arco e Felcha"),
                new Soldado("80608070", "Thurco", "Elfo", "Espada e Escudo"),
                new Soldado("03907050", "Karlin", "Elfo", "Adagas e Espada")
        );
    }
}
