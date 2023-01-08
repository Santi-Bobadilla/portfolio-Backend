/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IProyectoService{
    public List<Proyecto> verProyecto();
    public void crearProyecto(Proyecto proy);
    public void borrarProyecto(Long id);
}
