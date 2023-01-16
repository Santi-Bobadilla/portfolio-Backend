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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Administrador
 */
@Getter @Setter
@Entity
@Table(name="nacionalidad")
        
class Nacionalidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    
    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "nacionalidad_id")
    private List<Provincia> provincia;

    public Nacionalidad() {
    }

    public Nacionalidad(Long id, String nombre, List<Provincia> provincia) {
        this.id = id;
        this.nombre = nombre;
        this.provincia = provincia;
    }
    
    
}
