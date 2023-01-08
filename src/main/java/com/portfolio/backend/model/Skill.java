/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author santi
 */

@Getter @Setter
@Entity
@Table(name="skill")

public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private Long id_condicion;
    private int porcentaje;
    private int id_tipo_skill;
    private Long id_persona;

    public Skill() {
    }

    public Skill(Long id, String nombre, Long id_condicion, int porcentaje, int id_tipo_skill, Long id_persona) {
        this.id = id;
        this.nombre = nombre;
        this.id_condicion = id_condicion;
        this.porcentaje = porcentaje;
        this.id_tipo_skill = id_tipo_skill;
        this.id_persona = id_persona;
    }
    
    
}
