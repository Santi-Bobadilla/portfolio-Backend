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
@Table(name="experiencia_laboral")

public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private byte esTrabajoActual;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private Long id_persona;
    private int id_tipo_empleo;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, byte esTrabajoActual, String fechaInicio, String fechaFin, String descripcion, Long id_persona, int id_tipo_empleo) {
        this.id = id;
        this.nombre = nombre;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.id_persona = id_persona;
        this.id_tipo_empleo = id_tipo_empleo;
    }

    
    
}
