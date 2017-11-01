package org.my.spring.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SpringSecurityConfig {

	@Autowired
	public void configGlobal(AuthenticationManagerBuilder authenticationBuilder) throws Exception {
		authenticationBuilder.inMemoryAuthentication().withUser("willsmith").password("istheguru").roles("USER");
	}
}
