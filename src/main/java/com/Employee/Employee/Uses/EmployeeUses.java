package com.Employee.Employee.Uses;

import java.util.List;
import java.util.Optional;

import com.Employee.Employee.Core.Employee;

public interface EmployeeUses {
	public Optional<Employee> getOneEmployee(Integer id);
	public List<Employee> getAllEmployees();
}
