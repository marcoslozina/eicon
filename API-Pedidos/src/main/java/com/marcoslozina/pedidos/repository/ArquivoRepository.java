package com.marcoslozina.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoslozina.pedidos.domain.Arquivo;

public interface ArquivoRepository extends JpaRepository<Arquivo, Long> {

}
