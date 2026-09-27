package com.kodnest.fourthSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FourthSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ac  = SpringApplication.run(FourthSpringApplication.class, args);
		Employee ref = ac.getBean(Employee.class);
		System.out.println(ref);
	}

}
