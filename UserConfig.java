package com.example.idms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        
        UserDetails user = User.withUsername("admin")
                .password(passwordEncoder().encode("DriveSoft@@!")) 
                .roles("USER")
                .build();
        return username -> {
            if (username.equals("admin")) {
                return user;
            } else {
                throw new RuntimeException("User not found");
            }
        };
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
