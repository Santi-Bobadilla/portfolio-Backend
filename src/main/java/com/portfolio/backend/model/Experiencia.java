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
import jakarta.persistence.OneToOne;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private byte es_trabajo_actual;
    private String mes_inicio;
    private String anio_inicio;
    private String mes_fin;
    private String anio_fin;
    private String descripcion;
    
//    @JsonIgnore
    @OneToOne
    private Persona persona;
    
//    @JsonIgnore
    @ManyToOne
    private TipoEmpleo tipo_empleo;
    
    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, byte es_trabajo_actual, String mes_inicio, String anio_inicio, String mes_fin, String anio_fin, String descripcion, Persona persona, TipoEmpleo tipo_empleo) {
        this.id = id;
        this.nombre = nombre;
        this.es_trabajo_actual = es_trabajo_actual;
        this.mes_inicio = mes_inicio;
        this.anio_inicio = anio_inicio;
        this.mes_fin = mes_fin;
        this.anio_fin = anio_fin;
        this.descripcion = descripcion;
        this.persona = persona;
        this.tipo_empleo = tipo_empleo;
    }

    
}
