package br.lima.empresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.lima.empresa.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{
    
}