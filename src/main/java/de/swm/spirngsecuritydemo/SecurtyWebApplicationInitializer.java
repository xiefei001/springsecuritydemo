package de.swm.spirngsecuritydemo;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;



/**
 * Created by xie.fei on 03.05.2016.
 */
public class SecurtyWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer{

	public SecurtyWebApplicationInitializer(){
		super(SecurityConfig.class);
	}
}
