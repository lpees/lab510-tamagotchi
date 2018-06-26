package br.com.lab510.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.lab510.service", "br.com.lab510.db.repository", "br.com.lab510.db"})
public class TamagotchiSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(TamagotchiSpringApplication.class, args);
	}

}
