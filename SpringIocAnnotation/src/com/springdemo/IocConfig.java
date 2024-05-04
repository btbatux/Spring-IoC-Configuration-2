package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springdemo") // pakettek itüm classları tara ve database ifadesini bul.
public class IocConfig {

	
	@Bean // Bu bir bean anatasyonudur.
	public ICustomerDal database() {
		return new OracleSqlCustomerDal();
	}

}
