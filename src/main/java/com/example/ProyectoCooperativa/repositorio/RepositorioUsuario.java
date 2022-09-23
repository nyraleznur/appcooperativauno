package com.example.ProyectoCooperativa.repositorio;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario  extends JpaRepository<User, String>  {
    User findByEmail(String email);
}
