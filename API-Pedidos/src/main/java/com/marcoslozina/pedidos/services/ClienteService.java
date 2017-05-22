package com.marcoslozina.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.marcoslozina.pedidos.domain.Cliente;
import com.marcoslozina.pedidos.repository.ClienteRepository;
import com.marcoslozina.pedidos.services.exceptions.ClienteExistenteException;
import com.marcoslozina.pedidos.services.exceptions.ClienteNaoEncontradoException;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listar() {

	return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {

	if (cliente.getId() != null) {
	    Cliente a = clienteRepository.findOne(cliente.getId());

	    if (a != null) {
		throw new ClienteExistenteException("O cliente já existe.");
	    }
	}

	return clienteRepository.save(cliente);

    }

    public Cliente buscar(Long id) {
	Cliente cliente = clienteRepository.findOne(id);

	if (cliente == null) {
	    throw new ClienteNaoEncontradoException("O cliente não pôde ser encontrado.");
	}
	return cliente;
    }

    public void deletar(Long id) {
	try {
	    clienteRepository.delete(id);
	} catch (EmptyResultDataAccessException e) {
	    throw new ClienteNaoEncontradoException("O cliente não pôde ser encontrado.");
	}
    }

    public void atualizar(Cliente cliente) {
	verificarExistencia(cliente);
	clienteRepository.save(cliente);
    }

    private void verificarExistencia(Cliente cliente) {
	buscar(cliente.getId());
    }
}