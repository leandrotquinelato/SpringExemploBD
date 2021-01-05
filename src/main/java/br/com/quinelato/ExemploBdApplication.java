package br.com.quinelato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "br.com.quinelato.entity" })
@EnableJpaRepositories(basePackages = { "br.com.quinelato.repository" })
@ComponentScan(basePackages = {"br.com.quinelato.controller"})
public class ExemploBdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploBdApplication.class, args);
	}

}
