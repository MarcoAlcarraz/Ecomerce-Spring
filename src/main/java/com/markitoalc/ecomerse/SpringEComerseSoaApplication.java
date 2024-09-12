package com.markitoalc.ecomerse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringEComerseSoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEComerseSoaApplication.class, args);
	}

}
