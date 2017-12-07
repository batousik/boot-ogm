package com.example.bootogm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@SpringBootApplication
public class BootOgmApplication {

	public static void main(String[] args) {
		SpringApplication.run( BootOgmApplication.class );
	}

	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPersistenceUnitName( "mongodb-local" );
		return bean;
	}
}
