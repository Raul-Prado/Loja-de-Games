package com.generation.lojadegames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
