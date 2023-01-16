/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
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
@Table(name="persona")

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private String email;
    private String telefono;
    private String sobre_mi;
    private String ocupacion;
    private String image_background_header;
    private String image_perfil;

    @ManyToOne
    private Provincia provincia;
    
    public Persona(){
        
    };

    public Persona(Long id, String nombre, String apellido, String fecha_nacimiento, String email, String telefono, String sobre_mi, String ocupacion, String image_background_header, String image_perfil, Provincia provincia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.telefono = telefono;
        this.sobre_mi = sobre_mi;
        this.ocupacion = ocupacion;
        this.image_background_header = image_background_header;
        this.image_perfil = image_perfil;
        this.provincia = provincia;
    }

    
    
           
            
    
}
