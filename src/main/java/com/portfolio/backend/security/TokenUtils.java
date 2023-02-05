/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.util.Collections;
import java.util.Date;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class TokenUtils {
    
    private final static String ACCESS_TOKEN_SECRET = "ebe046886ff607c0ed81a61ac21138ba";
    private final static Long ACCESS_TOKEN_VALIDATY_SECONDS = 2_592_000L;
    
    public static String crearToken(String email){
        long expirationTime = ACCESS_TOKEN_VALIDATY_SECONDS * 1_000;
        Date expiratonDate = new Date(System.currentTimeMillis()+expirationTime);
        
        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(expiratonDate)
                .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
                .compact();
    }
    
    public static UsernamePasswordAuthenticationToken getAuthentication(String token){
        try{
            Claims claims = Jwts.parserBuilder()
                .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody();
        
            String email = claims.getSubject();

            return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());
        }catch(JwtException e){
            return null;
        }
    }
    
//    public boolean isTokenValid(String token, UserDetails userDetails){
//        final String username = 
//    }
}
