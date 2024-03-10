package com.webservice.baseservice.domain.Config;

import jakarta.servlet.FilterChain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Customise Spring security configuration
 * */

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                //No need to store client's session information in the server side :
                /**
                 * Stateless sessions can be more scalable because there is no need to store and manage session
                 * information on the server. Each request is processed independently, and the server does not
                 * need to maintain a connection or state for each client.
                 *
                 */
                .sessionManagement(sm->sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                //CROSS SITE REQUEST FORGERY
                .csrf(csrf->csrf.disable())
                .authorizeHttpRequests(ar->ar.requestMatchers("/api/**").permitAll())
                .authorizeHttpRequests(ar->ar.anyRequest().authenticated())
        .build();
    }

}
