package com.third.thirdSpring;

import org.springframework.stereotype.Component;

@Component
public class itDepartment implements Department{
	
	@Override
	public void work() {
		System.out.println("Employees should work under IT Department");
	}
   
}
