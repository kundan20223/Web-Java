package com.second.Secondspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondspringApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SecondspringApplication.class, args);
		Student ref = ac.getBean(Student.class);
		System.out.println(ref);
	}

}
