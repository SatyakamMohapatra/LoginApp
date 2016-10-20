package com.LoginApp.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"com.LoginApp"},
			   excludeFilters={@Filter(type=FilterType.ANNOTATION,
					   				   value=EnableWebMvc.class)})
public class WebRootConfig {
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/loginapp");
		dataSource.setUsername("root");
		dataSource.setPassword("satya");
		return dataSource;
	}
}
