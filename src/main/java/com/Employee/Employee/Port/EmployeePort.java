package com.Employee.Employee.Port;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.Employee.Employee.Core.Employee;

public interface EmployeePort {

	public Optional<Employee> getOneEmployee(Integer id);
	public List<Employee> getAllEmployees();
}
