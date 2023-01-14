/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.security;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 *
 * @author Administrador
 */

//@SpringBootApplication
@Configuration
public class CorsConfig {

	public static void main(String[] args) {
		SpringApplication.run(CorsConfig.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
                                registry.addMapping("/api/login")
                                        .allowedOrigins("http://localhost:4200")
                                        .allowedMethods("*")
                                        .exposedHeaders("*");
                            
				registry.addMapping("/api/**")
                                        .allowedOrigins("*")
                                        .allowedMethods("*");
			}
		};
	}

}
