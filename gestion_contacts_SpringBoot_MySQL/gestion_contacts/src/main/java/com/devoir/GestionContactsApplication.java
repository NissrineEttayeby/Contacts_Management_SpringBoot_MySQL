package com.devoir;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan("com.devoir.core.bo")
@ComponentScan("com.devoir.core.web.ContactController")
@ComponentScan("com.devoir.core.services.IGroupeService")
@EnableJpaRepositories("com.devoir.core.dao")
@ComponentScan("com.devoir.core.web")
@SpringBootApplication
public class GestionContactsApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(GestionContactsApplication.class, args);
	}

}
