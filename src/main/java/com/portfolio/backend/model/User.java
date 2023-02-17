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
 * @author santi
 */
@Getter @Setter
@Entity
@Table(name="user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String email;
    private String username;
    private String password;
    private byte verificado;
    private Timestamp created_at;
    private Timestamp updated_at;
    
    
    public User() {
    }

    public User(Long id, String email, String username, String password, byte verificado, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.verificado = verificado;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    

    
    
    
}
