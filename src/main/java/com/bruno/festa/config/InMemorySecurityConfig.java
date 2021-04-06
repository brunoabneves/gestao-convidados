package com.bruno.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception{
			builder
				.inMemoryAuthentication()
				.withUser("skywalker").password("123").roles("USER")
				.and()
				.withUser("eren").password("321").roles("USER")
				.and()
				.withUser("naruto").password("345").roles("USER");
	}
}
