package com.rubens.web;

import Model.Comosea1;
import Model.DAOUsuarioImpl;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicio-usuario")
public class ControllerUsuario {

@RequestMapping(value="/todos", method=RequestMethod.GET, headers=("Accept=Application/json"))

public @ResponseBody  ArrayList<Comosea1> buscarTodos(){
  
return DAOUsuarioImpl.implementarUsuario();

}
}
