package com.generation.crudfarmacia.controller;


import com.generation.crudfarmacia.model.Produtos;
import com.generation.crudfarmacia.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*" , allowedHeaders = "*")
public class ProdutosController {

    @Autowired
    private ProdutosRepository produtosRepository;

    @PostMapping("/cadastrar")
    public ResponseEntity<Produtos> cadastrar(@RequestBody Produtos produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtosRepository.save(produto));
    }
    @GetMapping
    public ResponseEntity<List<Produtos>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(produtosRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produtos> buscarPorId(@PathVariable Long id) {
        return produtosRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("nome/{nome}")
    public ResponseEntity<List<Produtos>> buscarPorNome(@PathVariable String nome) {
        List<Produtos> produtos = produtosRepository.findByNomeContainingIgnoreCase(nome);
        if (produtos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/disponiveis")
    public ResponseEntity<List<Produtos>> disponiveis() {
        List<Produtos> produtos = produtosRepository.findByDisponivelTrue();
        if (produtos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produtos);
    }

    @PutMapping
    public ResponseEntity<Produtos> atualizar(@RequestBody Produtos produto) {
        return ResponseEntity.status(HttpStatus.OK).body(produtosRepository.save(produto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        produtosRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
