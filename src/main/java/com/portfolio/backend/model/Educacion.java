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
@Table(name="educacion")

public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private String fecha_inicio;
    private String fecha_fin;
    private String certificacion;
    
    @JsonIgnore
    @ManyToOne
    private Persona persona;
    
//    @JsonIgnore
    @ManyToOne
    private Condicion condicion;

    public Educacion() {
    }

    public Educacion(Long id, String nombre, String fecha_inicio, String fecha_fin, String certificacion, Persona persona, Condicion condicion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.certificacion = certificacion;
        this.persona = persona;
        this.condicion = condicion;
    }

    

    
}
