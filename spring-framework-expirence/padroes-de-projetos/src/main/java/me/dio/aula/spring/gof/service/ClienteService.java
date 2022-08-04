package me.dio.aula.spring.gof.service;

import me.dio.aula.spring.gof.model.Cliente;

import java.util.Optional;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Optional<Cliente> buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void remover(Long id);
}
