package br.com.lab510.db;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class DatabaseConfig {
		
	@Bean
	public static DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/lab510?useTimezone=true&serverTimezone=UTC");
		ds.setUsername("root");	
		ds.setPassword("");
		 
		return ds;
	}
}
