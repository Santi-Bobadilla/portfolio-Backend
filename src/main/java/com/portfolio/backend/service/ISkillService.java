/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Skill;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ISkillService {
    public List<Skill> verSkill();
    public void crearSkill(Skill skill);
    public void borrarSkill(Long id);
    public void editarSkill(Skill skill);
}
