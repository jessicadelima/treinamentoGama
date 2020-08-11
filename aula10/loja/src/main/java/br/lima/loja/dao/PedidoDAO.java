package br.lima.loja.dao;

import org.springframework.data.repository.CrudRepository;

import br.lima.loja.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer>{
    
}