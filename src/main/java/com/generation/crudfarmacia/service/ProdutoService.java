package com.generation.crudfarmacia.service;

import com.generation.crudfarmacia.model.Produtos;

import java.util.List;

public interface ProdutoService {
    List<Produtos> buscarProdutosDisponiveis();
}
