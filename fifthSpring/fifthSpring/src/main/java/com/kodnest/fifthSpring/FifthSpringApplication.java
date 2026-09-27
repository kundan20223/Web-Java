package com.kodnest.fifthSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FifthSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FifthSpringApplication.class, args);
		Employee ref  =ac.getBean(Employee.class);
		System.out.println(ref);
	}

}
