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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private String link;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;
    private String url_image;
    
    @ManyToOne
    private Persona persona;
    
    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String link, String fecha_inicio, String fecha_fin, String descripcion, String url_image, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.link = link;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.url_image = url_image;
        this.persona = persona;
    }

    
}
