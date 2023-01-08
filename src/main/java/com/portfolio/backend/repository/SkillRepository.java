/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.repository;

import com.portfolio.backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author santi
 */
public interface SkillRepository extends JpaRepository<Skill,Long> {
    
}
