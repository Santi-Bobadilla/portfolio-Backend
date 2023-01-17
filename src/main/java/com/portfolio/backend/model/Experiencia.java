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
import jakarta.persistence.OneToOne;
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
@Table(name="experiencia_laboral")

public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private byte es_trabajo_actual;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;
    private Timestamp created_at;
    private Timestamp updated_at;
    
    @JsonIgnore
    @OneToOne
    private Persona persona;
    
//    @JsonIgnore
    @ManyToOne
    private TipoEmpleo tipo_empleo;
    
    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, byte es_trabajo_actual, String fecha_inicio, String fecha_fin, String descripcion, Timestamp created_at, Timestamp updated_at, Persona persona, TipoEmpleo tipo_empleo) {
        this.id = id;
        this.nombre = nombre;
        this.es_trabajo_actual = es_trabajo_actual;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.persona = persona;
        this.tipo_empleo = tipo_empleo;
    }

    

    
    
}
