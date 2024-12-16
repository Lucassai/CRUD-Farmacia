package com.generation.crudfarmacia.service;

import com.generation.crudfarmacia.model.Produtos;
import com.generation.crudfarmacia.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutosRepository produtosRepository;

    @Override
    public List<Produtos> buscarProdutosDisponiveis(){
        return produtosRepository.findByDisponivelTrue();
    }
}
