package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.LineasDeCredito;
import com.example.ProyectoCooperativa.entidades.User;

import java.util.Map;

public interface ServicioUsu {



    public User obtenerusuario(Map<String,Object> userData);

    public User guardarusuario(User user);




}
