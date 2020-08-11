package br.lima.loja.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.lima.loja.dao.PedidoDAO;
import br.lima.loja.model.Pedido;

@RestController
@CrossOrigin("*")
public class PedidoController {
    
    @Autowired
    private PedidoDAO dao;

    @GetMapping("/pedido/{numPedido}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable int numPedido){
        Pedido pedido = dao.findById(numPedido).orElse(null);

        if (pedido != null){
            return ResponseEntity.ok(pedido);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/pedidos")
    public ResponseEntity<ArrayList<Pedido>> buscarTodos(){
        ArrayList<Pedido> lista = (ArrayList<Pedido>) dao.findAll();

        return ResponseEntity.ok(lista);
    }

}