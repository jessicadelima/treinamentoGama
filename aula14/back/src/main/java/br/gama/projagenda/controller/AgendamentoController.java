package br.gama.projagenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.gama.projagenda.dao.AgendamentoDAO;
import br.gama.projagenda.model.Agendamento;

@RestController
@CrossOrigin("*")
public class AgendamentoController {

    @Autowired
    private AgendamentoDAO dao;

    @GetMapping("/agendamentos")
    public List<Agendamento> getAgendamentos() {
        List<Agendamento> lista = (List<Agendamento>)dao.findAll();
        return  lista;
    }

    @GetMapping("/agendamentos/{id}")
    public Agendamento getAgendamento(@PathVariable int id){
        Agendamento agendamento = dao.findById(id).orElse(null);
        return  agendamento;
    } 

    @GetMapping("/agendamentos/cliente/{nomeCliente}")
    public Agendamento getAgendamento(@PathVariable String nomeCliente){
        Agendamento agendamento = dao.findByNome(nomeCliente);
        return  agendamento;
    } 

}