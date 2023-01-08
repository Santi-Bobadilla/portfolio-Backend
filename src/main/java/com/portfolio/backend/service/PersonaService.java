/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persRepo.deleteById(id);
    }

    @Override
    public void editarPersona(Persona pers) {
        persRepo.findById(pers.getId()).orElse(null);
        persRepo.save(pers);
    }
    
}
