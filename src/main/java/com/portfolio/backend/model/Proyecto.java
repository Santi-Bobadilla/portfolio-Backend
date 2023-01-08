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
@Table(name="proyecto")

public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String link;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private String url_image;
    private Long id_persona;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String link, String fechaInicio, String fechaFin, String descripcion, String url_image, Long id_persona) {
        this.id = id;
        this.nombre = nombre;
        this.link = link;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.url_image = url_image;
        this.id_persona = id_persona;
    }
    
    
}
