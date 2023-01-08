/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service

public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyRepo;

    @Override
    public List<Proyecto> verProyecto() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public void editarProyecto(Proyecto proy) {
        proyRepo.findById(proy.getId()).orElse(null);
        proyRepo.save(proy);
    }    
    
}
