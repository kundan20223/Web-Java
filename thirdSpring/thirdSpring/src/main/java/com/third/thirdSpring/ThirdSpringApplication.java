package com.third.thirdSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ThirdSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ThirdSpringApplication.class, args);
		Employee ref = ac.getBean(Employee.class);
		//ref.work();
		System.out.println(ref);
	}

}
