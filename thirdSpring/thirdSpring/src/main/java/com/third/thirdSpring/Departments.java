package com.third.thirdSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Departments {
	
	int id;
	String name;
	String location;
	
	public Departments(@Value("${dept.id}") int id,
			@Value("${dept.name}") String name, @Value("${dept.location}") String location) {
		this.id = id;
		this.name = name;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Departments [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
