package com.ksga.keycloakdemo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun httpSecurity(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeRequests()
            .antMatchers("/private").authenticated()
            .antMatchers("/public").permitAll()
            .anyRequest().authenticated()

            .and()
            .oauth2ResourceServer().jwt()

        return http.build()
    }
}