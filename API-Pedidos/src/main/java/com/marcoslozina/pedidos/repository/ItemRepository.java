package com.marcoslozina.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoslozina.pedidos.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
