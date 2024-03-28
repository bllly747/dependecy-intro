package com.springbootFirstProgram.dependecy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependecySpringbootApplication {

	public static void main(String[] args) {
		var runApp = SpringApplication.run(DependecySpringbootApplication.class, args);

		Greeting greeting = runApp.getBean(Greeting.class);
		System.out.println(greeting.hello());

	}

	// Creating the first bean
	@Bean
	public Greeting greeting()
	{
		return new Greeting();
	}



}
