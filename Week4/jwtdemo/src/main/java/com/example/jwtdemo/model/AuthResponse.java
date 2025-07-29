// src/main/java/com/example/jwtdemo/model/AuthResponse.java
package com.example.jwtdemo.model;

public class AuthResponse {
    private final String token;
    public AuthResponse(String token) { this.token = token; }
    public String getToken() { return token; }
}
