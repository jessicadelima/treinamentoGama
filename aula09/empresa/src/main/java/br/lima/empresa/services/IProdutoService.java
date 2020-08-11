package br.lima.empresa.services;

import br.lima.empresa.model.Produto;

public interface IProdutoService {
    
    public Produto buscarProdutoPorCod(int cod);
    
}