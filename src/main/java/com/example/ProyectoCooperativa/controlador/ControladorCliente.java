package com.example.ProyectoCooperativa.controlador;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.User;
import com.example.ProyectoCooperativa.servicios.ServicioCliente;
import com.example.ProyectoCooperativa.servicios.ServicioImpCliente;
import com.example.ProyectoCooperativa.servicios.ServicioUsu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControladorCliente {

    @Autowired
    private ServicioImpCliente sic;
    private ServicioUsu serusu;

    public ControladorCliente(ServicioImpCliente sic, ServicioUsu serusu) {
        this.sic = sic;
        this.serusu = serusu;
    }

    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal OidcUser principal) {
       if(principal !=null) {//IF ESTE SE PONE DE ULTMAS SOLO VA EL SYSTEM
           User user=this.serusu.obtenerusuario(principal.getClaims());
           model.addAttribute("user",user);
       }
        return "index";
    }

    @GetMapping("cliente")
    public String listarclientes(Model modelo) {
        modelo.addAttribute("clientes",sic.listarClientes());
        return ("clientes");
    }


    @GetMapping("buscar/{b}")
    public Cliente consultar(@PathVariable("b") String id){
        return sic.consultaClientesPorId(id);
    }

    @GetMapping("cliente/nuevo")

    public String formularioregistrocliente(Model modelo){
        modelo.addAttribute("clienteinsertar", new Cliente());
        return "insertarcliente";
    }

    @PostMapping("cliente/guardar")
    public String guardarcliente (Cliente clie){
          sic.guardarClientes(clie);
        return "redirect:/cliente";
    }

   /*@PostMapping("guardar")
    public Cliente insertar(@RequestBody Cliente cli){
        return sic.guardarClientes(cli);
    }

    @PutMapping("actuakizar")
    public Cliente actualizar(@RequestBody Cliente cli){
        return sic.actualizarClientes(cli);
    }*/

    //@DeleteMapping
   // public void eliminar(@RequestBody Cliente cli){
   //     sic.eliminarClientes(cli.getDocumento());
    //}

    @GetMapping("cliente/eliminar/{id}")
    public String eliminarpoId(@PathVariable("id") String id){
        sic.eliminarClientesId(id);
        return ("redirect:/cliente");
    }

 /*   @PatchMapping("act/{id}")
     public Cliente actualizarpor(@PathVariable("id")String id, @RequestBody Map<Object,Object> objectMap){
       return sic.actualizarPorId(id,objectMap);
   }*/


    @GetMapping("clientes/actualizar/{id}")
    public String mostrarfrmeditarcliente(@PathVariable("id")String id,Model modelo){
        //clienterep.findById(id).get();
        Cliente cliente=sic.consultaClientesPorId(id);
        modelo.addAttribute("clienteinsertar", cliente);
        return "actualizarcliente";
    }


   @PostMapping ("cliente/actualizar")
    public String actualizarcliente (Cliente clie){
        sic.actualizarClientes(clie);
        return "redirect:/cliente";
    }



}
