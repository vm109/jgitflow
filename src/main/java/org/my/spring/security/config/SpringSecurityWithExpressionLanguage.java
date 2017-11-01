package org.my.spring.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SpringSecurityWithExpressionLanguage extends WebSecurityConfigurerAdapter {
 @Autowired
 public void configure(AuthenticationManagerBuilder auth) throws Exception {
	 auth.inMemoryAuthentication().withUser("ronbieber").password("nickrod").roles("USER")
	 .and().withUser("noddy").password("pogo").roles("ADMIN");
 }
 
 @Override
 protected void configure(HttpSecurity http) throws Exception {
	 http.authorizeRequests()
	 .antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/users/**").hasRole("USER").
	 antMatchers("/**").permitAll().anyRequest().authenticated()
     .and().formLogin();
	 
	 
 }
 
}

// http.authorizeRequests().antMatchers("/user/**").hasRole("USER").antMatchers("/**").permitAll().and().formLogin();