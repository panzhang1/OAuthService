package com.pangu.auth.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;


@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() throws Exception {
        return super.userDetailsServiceBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserBuilder users = User.withDefaultPasswordEncoder();
        UserDetails user1 = users
          .username("cgrant")
          .password("demo101")
          .roles("USER")
          .build();
        System.out.println("cgrant" + user1.getPassword());
        UserDetails user2 = users
                .username("admin")
                .password("demo101")
                .roles("USER", "ADMIN")
                .build();
        System.out.println("admin" + user2.getPassword());
        auth.inMemoryAuthentication()
            .withUser(user1)
            .withUser(user2);
    }
}
