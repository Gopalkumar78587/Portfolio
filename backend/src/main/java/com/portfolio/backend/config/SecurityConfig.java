package com.portfolio.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.portfolio.backend.security.JwtAuthFilter;

@Configuration
public class SecurityConfig {

    private final JwtAuthFilter jwtAuthFilter;

    public SecurityConfig(JwtAuthFilter jwtAuthFilter) {
        this.jwtAuthFilter = jwtAuthFilter;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
          .csrf(csrf -> csrf.disable())
          .authorizeHttpRequests(auth -> auth

              // PUBLIC
              .requestMatchers("/api/auth/**").permitAll()
              .requestMatchers("/api/projects/**").permitAll()
              .requestMatchers("/api/skills/**").permitAll()
              .requestMatchers("/api/employment/**").permitAll()
              .requestMatchers("/api/chat/**").permitAll()
              .requestMatchers("/api/chatbot/**").permitAll()
              .requestMatchers("/api/analytics/**").permitAll()


              // ADMIN (JWT REQUIRED)
              .requestMatchers("/api/admin/**").authenticated()

              .anyRequest().authenticated()
          )
          .addFilterBefore(jwtAuthFilter,
                  UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
