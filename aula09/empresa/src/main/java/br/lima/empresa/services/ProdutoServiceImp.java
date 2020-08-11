package br.lima.empresa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.lima.empresa.dao.ProdutoDAO;
import br.lima.empresa.model.Produto;

@Component
public class ProdutoServiceImp implements IProdutoService{
    
    @Autowired
    private ProdutoDAO repositorio;

    @Override
    public Produto buscarProdutoPorCod(int cod){
        Produto p = repositorio.findById(cod).orElse(null);

        return p;
        
    }

}