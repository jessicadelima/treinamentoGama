package br.gama.projagenda.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.gama.projagenda.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {
    public List<Agendamento> findAllByNomeContaining(String nomeCliente);

    public  List<Agendamento> findAllByDataAgendamento(LocalDate data);

    public List<Agendamento> findAllByNomeAndAgenciaId(String nomeCliente, int agenciaId);
}