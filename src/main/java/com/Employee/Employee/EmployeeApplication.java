package com.Employee.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeeApplication.class, args);
		TestClass test = (TestClass) context.getBean("testClass");
		System.out.println(test.test());
	}

}
