package com.example.ProyectoCooperativa.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="creditosos")
public class Creditos {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name="fecha_desembolso")
    @Temporal(TemporalType.DATE)
    private Date fechaDesembolso;
    @PrePersist
    public void PrePersist(){
        this.fechaDesembolso=new Date();
    }
    @Column(name="monto_prestado", nullable = false)
    private int montoPrestado;
    @Column(name = "plazo_prestado",nullable = false)
    private int plazoPrestado;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="documentocliente", nullable = false)
    private Cliente cliente;


     @ManyToOne (fetch = FetchType.LAZY,optional = false)
     @JoinColumn(name="codigo_linea", nullable = false)
     private LineasDeCredito lc;

    public Creditos(int codigo, Date fechaDesembolso, int montoPrestado, int plazoPrestado, Cliente cliente, LineasDeCredito lc) {
        this.codigo = codigo;
        this.fechaDesembolso = fechaDesembolso;
        this.montoPrestado = montoPrestado;
        this.plazoPrestado = plazoPrestado;
        this.cliente = cliente;
        this.lc = lc;
    }

    public LineasDeCredito getLc() {
        return lc;
    }

    public void setLc(LineasDeCredito lc) {
        this.lc = lc;
    }

    public Creditos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMontoPrestado() {
        return montoPrestado;
    }

    public void setMontoPrestado(int montoPrestado) {
        this.montoPrestado = montoPrestado;
    }

    public int getPlazoPrestado() {
        return plazoPrestado;
    }

    public void setPlazoPrestado(int plazoPrestado) {
        this.plazoPrestado = plazoPrestado;
    }

    public Date getFechaDesembolso() {
        return fechaDesembolso;
    }

    public void setFechaDesembolso(Date fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cli) {
        this.cliente = cliente;
    }

   /* public LineasDeCredito getLc() {
        return lc;
    }

    public void setLc(LineasDeCredito lc) {
        this.lc = lc;
    }*/
}
