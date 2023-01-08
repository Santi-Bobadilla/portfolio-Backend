/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IExperienciaService {
    public List<Experiencia> verExperiencia();
    public void creaExperiencia(Experiencia exp);
    public void borrarExperiencia(Long id);
    public void editarExperiencia(Experiencia exp);
}
