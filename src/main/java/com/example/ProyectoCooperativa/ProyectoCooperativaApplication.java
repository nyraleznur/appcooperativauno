package com.example.ProyectoCooperativa;

import com.example.ProyectoCooperativa.entidades.Cliente;
//import com.example.ProyectoCooperativa.entidades.Creditos;
import com.example.ProyectoCooperativa.entidades.Creditos;
import com.example.ProyectoCooperativa.entidades.LineasDeCredito;
//import com.example.ProyectoCooperativa.repositorio.RepositorioCreditos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ProyectoCooperativaApplication  {

	//private RepositorioCreditos rc;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoCooperativaApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Cliente cli=new Cliente("4444","n","n","jjj","jj");

		Creditos cre =new Creditos(1,21000,12,new Date(),cli);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Cliente cli=new Cliente(100l,"n","n","jjj","jj");
		LineasDeCredito lc=new LineasDeCredito(1212,"kkkk",250,12);

		Creditos cre=new Creditos(200,200,12,new Date(),cli,lc);
		cli.setDocumento(cli.getDocumento());
		lc.setCodigo(lc.getCodigo());
        rc.save(cre);

	}*/
}
