package br.lima.loja.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id //indica que é chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //geração automática da chave primária
    @Column(name = "numPedido")
    private int numPedido;

    @Column(name = "status", length = 1)
    private String status;

    @Column(name = "dataPedido")
    @Temporal(TemporalType.DATE)
    private Date dataPedido;

    @ManyToOne
    @JsonIgnoreProperties("pedidos") //não traz os pedidos do solicitante
    private Usuario solicitante;

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    
}