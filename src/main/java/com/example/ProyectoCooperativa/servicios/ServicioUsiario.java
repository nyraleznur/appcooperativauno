package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.User;
import com.example.ProyectoCooperativa.repositorio.RepositorioUsuario;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServicioUsiario implements ServicioUsu {

  private RepositorioUsuario ru;

  public ServicioUsiario(RepositorioUsuario ru) {
    this.ru = ru;
  }

  @Override
  public User guardarusuario(User user) {
    return this.ru.save(user);
  }
public  User buscarporemail(String email){
   return  this.ru.findByEmail(email);
}




  public User obtenerusuario(Map<String, Object> userData) {
    String email = (String) userData.get("email");
    User user = buscarporemail(email);
    if (user == null) {
      String name = (String) userData.get("nichname");
      String image = (String) userData.get("picture");
      String auth0Id = (String) userData.get("sub");
      User userr = new User(email = email, image = image, auth0Id = auth0Id);

      return guardarusuario(userr);
    }
    System.out.println(user.getEmail());
    return user;
  }






}
