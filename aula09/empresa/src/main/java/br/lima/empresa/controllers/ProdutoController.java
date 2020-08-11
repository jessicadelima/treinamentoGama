package br.lima.empresa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.lima.empresa.model.Produto;
import br.lima.empresa.services.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {
    
    @Autowired
    private IProdutoService servico;

    @GetMapping("/produto/{cod}")
    public ResponseEntity<Produto> buscarProdutoPorCod(@PathVariable int cod){
        Produto produto = servico.buscarProdutoPorCod(cod);
        
        if (produto != null) { // encontrou o produto no banco de dados
            return ResponseEntity.ok(produto); //responde ok para o front com o produto encontrado
        } else {
            return ResponseEntity.notFound().build(); //responde para o front que não achou o produto
        }
    }

}