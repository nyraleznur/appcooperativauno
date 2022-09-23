package com.example.ProyectoCooperativa.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="LineasCreditos")
public class LineasDeCredito {
    @Id
    private Integer codigo;
    @Column
    private String nombre;
    @Column
    private int montoMaximo;
    @Column
    private int plazoMaximo;
   // @JsonIgnore
    //@OneToMany(mappedBy = "lc",cascade = CascadeType.ALL)
   // private List<Creditos> creditos;
    //private Set<Creditos> creditos= new HashSet<Creditos>();



    /*

    public void addEmployee(Cliente clie) {
        Clie.add(clie);
        clie.getCredit().add(this);
    }*/

    //public List<Creditos> getCreditos() {
      //  return creditos;
    //}

    //public void setCreditos(List<Creditos> creditos) {
      //  this.creditos = creditos;
    //}

    public LineasDeCredito(Integer codigo, String nombre, int montoMaximo, int plazoMaximo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.montoMaximo = montoMaximo;
        this.plazoMaximo = plazoMaximo;
    }

    public LineasDeCredito() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(int montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }






}
