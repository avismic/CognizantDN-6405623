// InMemoryUserDetailsService.java
package com.example.jwtdemo.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // for demo, a single user: user/password
        if ("user".equals(username)) {
            return new User(
                "user",
                "{noop}password",       // {noop} = plain text (not for prod!)
                List.of(new SimpleGrantedAuthority("ROLE_USER"))
            );
        }
        throw new UsernameNotFoundException("User not found: " + username);
    }
}
