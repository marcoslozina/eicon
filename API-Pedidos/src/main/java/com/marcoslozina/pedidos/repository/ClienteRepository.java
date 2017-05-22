package com.marcoslozina.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoslozina.pedidos.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
