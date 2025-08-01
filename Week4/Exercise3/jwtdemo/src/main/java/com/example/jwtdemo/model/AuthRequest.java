// Path: src/main/java/com/example/jwtdemo/model/AuthRequest.java
package com.example.jwtdemo.model;

public class AuthRequest {
    private String username;
    private String password;

    public AuthRequest() { }

    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // ← THESE MUST EXIST
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
