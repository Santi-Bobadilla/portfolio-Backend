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
import com.portfolio.backend.model.Skill;
import com.portfolio.backend.model.User;
import com.portfolio.backend.service.IEducacionService;
import com.portfolio.backend.service.IExperienciaService;
import com.portfolio.backend.service.IPersonaService;
import com.portfolio.backend.service.IProyectoService;
import com.portfolio.backend.service.ISkillService;
import com.portfolio.backend.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author santi
 */
@RestController
@CrossOrigin(origins = "https://portfolio-arg-prog-1754b.web.app")
@RequestMapping("/api")
//@CrossOrigin(origins = "*")
public class Controller {
    
    // Persona
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
    
    @PatchMapping("/editar/{id}")
    public void editarPersona(@PathVariable Long id, @RequestBody Persona pers){
        persoServ.editarPersona(id, pers);
    }
    
    // Usuario
    @Autowired
    private IUserService userServ;
    
    // login 
    
    
    @PostMapping("/login")
    public void loginUsuario(@RequestBody User user){
        userServ.loginUsuario(user);
    }
    
    @PostMapping("/register")
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
    
    @PatchMapping("/editarUser/{id}")
    public void editarUsuario(@RequestBody User user){
        userServ.editarUsuario(user);
    }
    
    // Educacion
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping("/ver/edu")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @PostMapping("/new/edu")
    public void crearEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    
    @DeleteMapping("/deleteEdu/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }

    @PatchMapping("/editarEdu/{id}")
    public void editarEducacion(@RequestBody Educacion edu) {
        eduServ.editarEducacion(edu);
    }    
   
    // Experiencia
    
    @Autowired
    private IExperienciaService expServ;

    @GetMapping("/ver/exp")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expServ.verExperiencia();
    }
    
    @PostMapping("/new/exp")
    public void creaExperiencia(@RequestBody Experiencia exp) {
        expServ.creaExperiencia(exp);
    }

    @DeleteMapping("/deleteExp/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }

    @PatchMapping("/editarExp/{id}")
    public void editarExperiencia(@RequestBody Experiencia exp) {
        expServ.editarExperiencia(exp);
    }
        
    // Proyecto
    
    @Autowired
    private IProyectoService proyServ;

    @GetMapping("/ver/proy")
    @ResponseBody
    public List<Proyecto> verProyecto() {
        return proyServ.verProyecto();
    }

    @PostMapping("/new/proy")
    public void crearProyecto(@RequestBody Proyecto proy) {
        proyServ.crearProyecto(proy);
    }
    
    @DeleteMapping("/deleteProy/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        proyServ.borrarProyecto(id);
    }

    @PatchMapping("/editarProy/{id}")
    public void editarProyecto(@RequestBody Proyecto proy) {
        proyServ.editarProyecto(proy);
    }
    
    // Skill
    
    @Autowired
    private ISkillService skillServ;

    @GetMapping("/ver/skill")
    @ResponseBody
    public List<Skill> verSkill() {
        return skillServ.verSkill();
    }

    @PostMapping("/new/skill")
    public void crearSkill(@RequestBody Skill skill) {
        skillServ.crearSkill(skill);
    }

    @DeleteMapping("/deleteSkill/{id}")
    public void borrarSkill(@PathVariable Long id) {
        skillServ.borrarSkill(id);
    }

    @PatchMapping("/editarSkill/{id}")
    public void editarSkill(@RequestBody Skill skill) {
        skillServ.editarSkill(skill);
    }
    
        
    
}
