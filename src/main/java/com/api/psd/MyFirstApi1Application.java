package com.api.psd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyFirstApi1Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyFirstApi1Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MyFirstApi1Application.class, args);
	}

	@RestController
	class HelloController {

		@GetMapping("/")
		public String hello() {
			return "Hello, world!";
		}
	}

}
