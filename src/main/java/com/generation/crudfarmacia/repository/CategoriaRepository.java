package com.generation.crudfarmacia.repository;

import com.generation.crudfarmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {

    public List<Categoria> findByNomeContainingIgnoreCase(String nome);

}