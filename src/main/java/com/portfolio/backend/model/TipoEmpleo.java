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
import java.sql.Timestamp;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Administrador
 */

@Getter @Setter
@Entity
@Table(name="tipo_empleo")
        
class TipoEmpleo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String nombre;
    private Timestamp created_at;
    private Timestamp updated_at;
    
    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "tipo_empleo_id")
    private List<Experiencia> experiencia;

    public TipoEmpleo() {
    }

    public TipoEmpleo(Long id, String nombre, Timestamp created_at, Timestamp updated_at, List<Experiencia> experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.experiencia = experiencia;
    }

   
    
    
    
}
