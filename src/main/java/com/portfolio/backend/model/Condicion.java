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
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Administrador
 */
@Getter @Setter
@Entity
@Table(name="condicion")
        
class Condicion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private Timestamp created_at;
    private Timestamp updated_at;
    
//    @OneToMany
//    @JoinColumn(name = "condicion_id")
//    private List<Educacion> educacion;

    public Condicion() {
    }

    public Condicion(Long id, String nombre, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.nombre = nombre;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

  
    
    
    
}
