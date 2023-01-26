/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.User;
import com.portfolio.backend.repository.UserRepository;
import com.portfolio.backend.security.UserDetailServiceImpl;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class UserService implements IUserService{
    @Autowired
    public UserRepository userRepo;
    
    @Autowired
    private PasswordEncoder bcryptEncoder;
    
    @Autowired
    private UserDetailServiceImpl userDetailServiceImpl;
    
    @Override
    public List<User> verUsuarios() {
        return userRepo.findAll();
    }


    @Override
    public void crearUsuario(User user) {
        User newUser = new User();
		newUser.setEmail(user.getEmail());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
                newUser.setCreated_at(new Timestamp(System.currentTimeMillis()));
		userRepo.save(newUser);
    }
    
    @Override
    public void borrarUsuario(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void editarUsuario(User user) {
        User editUser = userRepo.findById(user.getId()).orElse(null);
		editUser.setEmail(user.getEmail());
		editUser.setPassword(bcryptEncoder.encode(user.getPassword()));
                editUser.setUpdated_at(new Timestamp(System.currentTimeMillis()));
		userRepo.save(editUser);
    }

    @Override
    public void loginUsuario(User user) {
        User login = userRepo.findById(user.getId()).orElse(null);
        if (login!= null) {
            login.getEmail();
            login.getPassword();
            userDetailServiceImpl.loadUserByUsername(user.getEmail());   
        }
		
    }
    
}
