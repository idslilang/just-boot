package com.just.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class JustBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustBootApplication.class, args);
	}

}
