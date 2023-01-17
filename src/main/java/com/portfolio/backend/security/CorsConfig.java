/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.security;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 *
 * @author Administrador
 */

//@SpringBootApplication
@EnableWebMvc
@Configuration
public class CorsConfig implements WebMvcConfigurer{
        
        public void addCorsMapping(CorsRegistry registry){
            registry.addMapping("/**");
        }
//	public static void main(String[] args) {
//		SpringApplication.run(CorsConfig.class, args);
//	}
//        
        
//	@Bean
//	public WebMvcConfigurer corsConfigurer(){
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//                                registry.addMapping("/api/login")
//                                        .allowedOrigins("https://portfolio-argentina-prog-92fa8.firebaseapp.com")
//                                        .allowedMethods("*")
//                                        .exposedHeaders("*");
//                            
//				registry.addMapping("/api/**")
//                                        .allowedOrigins("*")
//                                        .allowedMethods("*");
//			}
//		};
//	}

}
