package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona(Persona pers);
    public void borrarPersona(Long id);
    public void editarPersona(Persona pers);
}
