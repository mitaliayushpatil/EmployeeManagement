package com.Employee.Employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Employee.Core.Employee;
import com.Employee.Employee.Port.EmployeePort;
import com.Employee.Employee.PortImpl.EmployeeCustomImpl;
import com.Employee.Employee.PortImpl.EmployeePortImpl;
import com.Employee.Employee.Uses.EmployeeUses;
@Service
public class EmployeeService implements EmployeeUses{

	@Autowired
	private EmployeePortImpl port;
	@Autowired
	private EmployeeCustomImpl custom;
	@Override
	public Optional<Employee> getOneEmployee(Integer id) {return port.getOneEmployee(id);}

	@Override
	public List<Employee> getAllEmployees() {return port.getAllEmployees();}

}
