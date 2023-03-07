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
@Table(name="proyecto")

public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private String link;
    private String mes_inicio;
    private String anio_inicio;
    private String mes_fin;
    private String anio_fin;
    private String descripcion;
    private String url_image;
    private Timestamp created_at;
    private Timestamp updated_at;
    
    @ManyToOne
    private Persona persona;
    
    public Proyecto() {
    }


    public Proyecto(Long id, String nombre, String link, String mes_inicio, String anio_inicio, String mes_fin, String anio_fin, String descripcion, String url_image, Persona persona) {

    public Proyecto(Long id, String nombre, String link, String fecha_inicio, String fecha_fin, String descripcion, String url_image, Timestamp created_at, Timestamp updated_at, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.link = link;
        this.mes_inicio = mes_inicio;
        this.anio_inicio = anio_inicio;
        this.mes_fin = mes_fin;
        this.anio_fin = anio_fin;
        this.descripcion = descripcion;
        this.url_image = url_image;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.persona = persona;
    }

}
