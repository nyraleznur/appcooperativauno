package com.example.ProyectoCooperativa.controlador;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.LineasDeCredito;
import com.example.ProyectoCooperativa.servicios.ServiciImpLineasCredito;
import com.example.ProyectoCooperativa.servicios.ServicioImpCliente;
import com.example.ProyectoCooperativa.servicios.ServicioLineasCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/lineas")
@RestController
public class ControladorLineasCredito {

    @Autowired
    private ServiciImpLineasCredito sic;

    @GetMapping
    public List<LineasDeCredito> listar(){
        return sic.listarLineasCredito();
    }

    @GetMapping("/{b}")
    public LineasDeCredito consultar(@PathVariable("b") Integer id){
        return sic.consultaLineasCredito(id);
    }

    @PostMapping
    public LineasDeCredito  insertar(@RequestBody LineasDeCredito lc) {

        return sic.guardarLineasCredito(lc);
    }







}
