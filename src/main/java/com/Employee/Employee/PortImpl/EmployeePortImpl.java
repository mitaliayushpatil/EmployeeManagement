package com.Employee.Employee.PortImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import com.Employee.Employee.Core.Employee;
import com.Employee.Employee.Mappers.EmployeeMappers;
import com.Employee.Employee.Port.EmployeePort;
import com.Employee.Employee.Repository.EmployeeRepository;

public class EmployeePortImpl implements EmployeePort{

	@Autowired
	EmployeeRepository repository;
	
	@Autowired
	EmployeeMappers mappers;
	@Override
	public Optional<Employee> getOneEmployee(Integer id) {
		var employee = repository.findById(id);
		return employee.map(employeeEntity->mappers.entitytoDomain(employeeEntity));
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return mappers.entitiestoDomain(StreamSupport.stream(repository.findAll().spliterator(), false)
				.collect(Collectors.toList()));
	}

}
