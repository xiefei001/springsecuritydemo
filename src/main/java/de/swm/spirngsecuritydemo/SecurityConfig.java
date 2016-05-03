package de.swm.spirngsecuritydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


/**
 * Created by xie on 2016/5/2.
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("pwd").roles("USER");
	}


	@Override
	public void configure(HttpSecurity http) throws Exception {
        http.logout().logoutUrl("/logout");
		http.csrf().disable();
				//.logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
		http.authorizeRequests().anyRequest().authenticated()
			.and().formLogin().and().httpBasic();
	}

}
