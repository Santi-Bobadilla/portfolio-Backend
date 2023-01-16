/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
    private String porcentaje;
    
    @JsonIgnore
    @ManyToOne
    private Persona persona;
    
//    @JsonIgnore
    @ManyToOne
    private TipoSkill tipo_skill;

    public Skill() {
    }

    public Skill(Long id, String nombre, String porcentaje, Persona persona, TipoSkill tipo_skill) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.persona = persona;
        this.tipo_skill = tipo_skill;
    }

    
    
    
}
