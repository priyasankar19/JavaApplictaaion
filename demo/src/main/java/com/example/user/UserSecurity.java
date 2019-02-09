package com.example.user;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class UserSecurity extends WebSecurityConfigurerAdapter
{
	 @Autowired
  DataSource dataSource;
	 @Override
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception
	 {
	//auth.jdbcAuthentication().dataSource(dataSource);	
		 auth.inMemoryAuthentication().withUser("priya").password("{noop}test").
		 roles("USER");
	 }
	 @Override
		protected void configure(HttpSecurity http) throws Exception {
			http
				.authorizeRequests()
				.antMatchers("/createUser")
				.authenticated()		
				.and()
				.httpBasic();
			http.csrf().disable();
		}	 
	 
	//private static String REALM="MY_TEST_REALM";
//	@Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("bill").password("abc123").roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("tom").password("abc123").roles("USER");
//    }
//	 @Bean
//    public CustomBasicAuthenticationEntryPoint getBasicAuthEntryPoint(){
//        return new CustomBasicAuthenticationEntryPoint();
//    }
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * http.authorizeRequests() .antMatchers("/*").permitAll();
	 * 
	 * http.csrf().disable(); //
	 * .and().httpBasic().realmName(REALM).authenticationEntryPoint(
	 * getBasicAuthEntryPoint()) }
	 */



}
