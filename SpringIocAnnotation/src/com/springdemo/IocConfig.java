package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springdemo") // paketteki tüm classları tara ve database ifadesini bul.
public class IocConfig {

	
	@Bean // Bu bir bean anatasyonudur. //Main'de database ifadesiniburada bulacak ve ICustomerDal metodunda yer alan veritabanını return edecek.
	public ICustomerDal database() {
		return new OracleSqlCustomerDal();
	}

}
