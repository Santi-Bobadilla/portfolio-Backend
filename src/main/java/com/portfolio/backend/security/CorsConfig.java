/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 *
 * @author Administrador
 */

@EnableWebMvc
@Configuration
public class CorsConfig implements WebMvcConfigurer{ 
        
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**");
//    }
//    
	@Bean
             
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
                                registry.addMapping("/**")
                                        .allowedOrigins("*")
                                        .allowedMethods("*")
                                        .exposedHeaders("*");
                            
				registry.addMapping("/api/**")
                                        .allowedOrigins("*")
                                        .allowedMethods("*");
			}
		};
	}

}
