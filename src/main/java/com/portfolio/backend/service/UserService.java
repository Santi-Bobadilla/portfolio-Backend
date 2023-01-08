/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.User;
import com.portfolio.backend.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class UserService implements IUserService{
    @Autowired
    public UserRepository userRepo;

    @Override
    public List<User> verUsuarios() {
        return userRepo.findAll();
    }

    @Override
    public void crearUsuario(User user) {
        userRepo.save(user);
    }

    @Override
    public void borrarUsuario(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void editarUsuario(User user) {
        userRepo.findById(user.getId()).orElse(null);
        userRepo.save(user);
    }
    
}
