// Path: src/main/java/com/example/jwtdemo/controller/AuthController.java
package com.example.jwtdemo.controller;

import com.example.jwtdemo.model.AuthRequest;
import com.example.jwtdemo.model.AuthResponse;
import com.example.jwtdemo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")            // optional base path
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public AuthResponse authenticate(@RequestBody AuthRequest request) {
        // 1. Authenticate username/password
        authManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.getUsername(),    // <— calls getUsername()
                request.getPassword()     // <— calls getPassword()
            )
        );

        // 2. Load the user details and generate a JWT
        UserDetails user = userDetailsService.loadUserByUsername(request.getUsername());
        String token = jwtUtil.generateToken(user.getUsername());

        // 3. Return the token wrapped in AuthResponse
        return new AuthResponse(token);
    }
}
