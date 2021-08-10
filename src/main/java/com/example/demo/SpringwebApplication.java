package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController	
@SpringBootApplication
public class SpringwebApplication {

	@RequestMapping(value="/")
	public String index() {
		return "<h1>Hello from Spring Web App</h1>"
				+ "<p>The app is running</p>";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringwebApplication.class, args);
	}

}
