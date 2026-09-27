package com.kodnest.fifthSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${emp.id}")
	int id;
	@Value("${emp.name}")
	String name;
	@Value("${emp.salary}")
	int salary;
	
	@Autowired
	 Department dept;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int salary, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	

}
