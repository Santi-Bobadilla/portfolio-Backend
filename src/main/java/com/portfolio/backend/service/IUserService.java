/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.User;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IUserService {
    public List<User> verUsuarios();
    public void crearUsuario(User user);
    public void borrarUsuario(Long id);
    public User buscarUsuario(Long id);
}
