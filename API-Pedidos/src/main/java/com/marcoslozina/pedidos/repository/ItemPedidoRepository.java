package com.marcoslozina.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoslozina.pedidos.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}
