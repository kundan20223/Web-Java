package com.second.Secondspring;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	int id = 12;
	String name = "Omkar";
	Address addr;
	
	public Student(Address addr) {
		super();
		this.addr = addr;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

	
	
	
	
	
	
	

}
