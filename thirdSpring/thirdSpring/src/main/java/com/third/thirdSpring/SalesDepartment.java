package com.third.thirdSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SalesDepartment implements Department {
	
	@Override
	public void work() {
		System.out.println("Employees should work under sales dept ");
	}

}
