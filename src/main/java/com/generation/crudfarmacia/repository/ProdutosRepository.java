package com.generation.crudfarmacia.repository;

import com.generation.crudfarmacia.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    public List<Produtos> findByNomeContainingIgnoreCase(String nome);

}
