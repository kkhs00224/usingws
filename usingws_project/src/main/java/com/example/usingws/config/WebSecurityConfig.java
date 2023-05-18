package com.example.usingws.config;

import com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.headers().frameOptions().sameOrigin();

        http.authorizeHttpRequests((requests)->requests
                .requestMatchers("/","/css/**","/js/**").permitAll()
                .anyRequest().authenticated()
                )
                .formLogin((form)->form
                        .loginPage("/login")
                        .permitAll()
                )
                .logout((logout)->logout.permitAll());


        return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

}
