/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.model.User;
import com.portfolio.backend.service.IPersonaService;
import com.portfolio.backend.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author santi
 */
@RestController

public class Controller {
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/new/persona")
    public void crearPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("/editar/{id}")
    public void editarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @Autowired
    private IUserService userServ;
    
    @PostMapping("/new/user")
    public void crearUser(@RequestBody User user){
        userServ.crearUsuario(user);
    }
    
    @GetMapping("/ver/users")
    @ResponseBody
    public List<User> verUsuarios(){
        return userServ.verUsuarios();
    }
    
    @DeleteMapping("/deleteUser/{id}")
    public void borrarUsuario(@PathVariable Long id){
        userServ.borrarUsuario(id);
    }
    
    @PutMapping("/editarUser/{id}")
    public void editarUsuario(@RequestBody User user){
        userServ.crearUsuario(user);
    }
}
