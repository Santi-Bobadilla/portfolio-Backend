/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
@Table(name="persona")

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private int id_nacionalidad;
    private String email;
    private String telefono;
    private String sobre_mi;
    private String ocupacion;
    private String image_background_header;
    private String image_perfil;
    private int id_domicilio;
    
    public Persona(){
        
    };
    
    public Persona(Long id, String nombre, String apellido, String fecha_nacimiento, int id_nacionalidad, String email, String telefono, String sobre_mi,
    String ocupacion, String image_background_header, String image_perfil, int id_domicilio){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fecha_nacimiento=fecha_nacimiento;
        this.id_nacionalidad=id_nacionalidad;
        this.email=email;
        this.telefono=telefono;
        this.sobre_mi=sobre_mi;
        this.ocupacion=ocupacion;
        this.image_background_header=image_background_header;
        this.image_perfil=image_perfil;
        this.id_domicilio=id_domicilio;
    };
            
            
            
    
}
