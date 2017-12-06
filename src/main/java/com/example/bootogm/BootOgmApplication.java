package com.example.bootogm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})

public class BootOgmApplication {

	public static void main(String[] args) {
		SpringApplication.run( BootOgmApplication.class );
	}

	@Bean
	LocalContainerEntityManagerFactoryBean entityManager() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPersistenceUnitName("mongodb-local");
		return bean;
	}
//
//	@Bean
//	TransactionTemplate transactionTemplate(){
//		TransactionTemplate transactionTemplate = new TransactionTemplate();
//		transactionTemplate.setTransactionManager(platformTransactionManager());
//		return transactionTemplate;
//	}

//	@Bean
//	PlatformTransactionManager platformTransactionManager(){
//		JtaTransactionManager jtaTransactionManager = new JtaTransactionManager();
//		TransactionManagerImple transactionManagerImple  = new TransactionManagerImple();
//		jtaTransactionManager.setTransactionManager(transactionManagerImple);
//		return jtaTransactionManager;
//	}

}
