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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp;
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
    private String mes_inicio;
    private String anio_inicio;
    private String mes_fin;
    private String anio_fin;
    private String certificacion;
    private Timestamp created_at;
    private Timestamp updated_at;
    
//    @JsonIgnore
    @ManyToOne
    private Persona persona;
    
//    @JsonIgnore
    @ManyToOne
    private Condicion condicion;

    public Educacion() {
    }

    public Educacion(Long id, String nombre, String mes_inicio, String anio_inicio, String mes_fin, String anio_fin, String certificacion, Timestamp created_at, Timestamp updated_at, Persona persona, Condicion condicion) {
        this.id = id;
        this.nombre = nombre;
        this.mes_inicio = mes_inicio;
        this.anio_inicio = anio_inicio;
        this.mes_fin = mes_fin;
        this.anio_fin = anio_fin;
        this.certificacion = certificacion;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.persona = persona;
        this.condicion = condicion;
    }


   
}
