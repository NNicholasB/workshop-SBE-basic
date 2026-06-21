package com.graciano.produtosapi.repository;

import com.graciano.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<Produto,String> {
}
