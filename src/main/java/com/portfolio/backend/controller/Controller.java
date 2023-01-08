/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.model.Persona;
import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.model.User;
import com.portfolio.backend.service.IEducacionService;
import com.portfolio.backend.service.IExperienciaService;
import com.portfolio.backend.service.IPersonaService;
import com.portfolio.backend.service.IProyectoService;
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
    
    // Persona
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/api/new/persona")
    public void crearPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/api/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/api/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("/api/editar/{id}")
    public void editarPersona(@RequestBody Persona pers){
        persoServ.editarPersona(pers);
    }
    
    // Usuario
    @Autowired
    private IUserService userServ;
    
    @PostMapping("/api/new/user")
    public void crearUser(@RequestBody User user){
        userServ.crearUsuario(user);
    }
    
    @GetMapping("/api/ver/users")
    @ResponseBody
    public List<User> verUsuarios(){
        return userServ.verUsuarios();
    }
    
    @DeleteMapping("/api/deleteUser/{id}")
    public void borrarUsuario(@PathVariable Long id){
        userServ.borrarUsuario(id);
    }
    
    @PutMapping("/api/editarUser/{id}")
    public void editarUsuario(@RequestBody User user){
        userServ.editarUsuario(user);
    }
    
    // Educacion
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping("/api/ver/edu")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @PostMapping("/api/new/edu")
    public void crearEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    
    @DeleteMapping("/api/deleteEdu/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }

    @PutMapping("/api/editarEdu/{id}")
    public void editarEducacion(Educacion edu) {
        eduServ.editarEducacion(edu);
    }    
   
    // Experiencia
    
    @Autowired
    private IExperienciaService expServ;

    @GetMapping("/api/ver/exp")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expServ.verExperiencia();
    }
    
    @PostMapping("/api/new/exp")
    public void creaExperiencia(@RequestBody Experiencia exp) {
        expServ.creaExperiencia(exp);
    }

    @DeleteMapping("/api/deleteExp/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }

    @PutMapping("/api/editarExp/{id}")
    public void editarExperiencia(Experiencia exp) {
        expServ.editarExperiencia(exp);
    }
        
    // Proyecto
    
    @Autowired
    private IProyectoService proyServ;

    @GetMapping("/api/ver/proy")
    @ResponseBody
    public List<Proyecto> verProyecto() {
        return proyServ.verProyecto();
    }

     @PostMapping("/api/new/proy")
    public void crearProyecto(Proyecto proy) {
        proyServ.crearProyecto(proy);
    }
    
    @DeleteMapping("/api/deleteProy/{id}")
    public void borrarProyecto(Long id) {
        proyServ.borrarProyecto(id);
    }

    @PutMapping("/api/editarProy/{id}")
    public void editarProyecto(Proyecto proy) {
        proyServ.editarProyecto(proy);
    }
    
    
    
    
    
    
    
    
}
