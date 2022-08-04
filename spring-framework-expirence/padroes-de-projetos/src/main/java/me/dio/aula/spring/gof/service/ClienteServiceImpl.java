package me.dio.aula.spring.gof.service;

import me.dio.aula.spring.gof.model.Cliente;
import me.dio.aula.spring.gof.model.ClienteRepository;
import me.dio.aula.spring.gof.model.Endereco;
import me.dio.aula.spring.gof.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {

        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {

        return clienteRepository.findById(id);
    }

    /**
     * Realiza a busca do endereço pelo CEP na base de dados.
     * Caso o retorno seja nulo, então vamos buscar o endereço
     * diretamente na API de CEP.
     *
     * @param cliente
     */
    @Override
    public void inserir(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();

        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco newEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(newEndereco);
            return newEndereco;
        });

        cliente.setEndereco(endereco);

        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clientePersistente = clienteRepository.findById(id);
        if (clientePersistente.isPresent()) {
            inserir(cliente);
        }
    }

    @Override
    public void remover(Long id) {

        clienteRepository.deleteById(id);
    }
}
