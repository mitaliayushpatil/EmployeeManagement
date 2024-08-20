package com.Employee.Employee.Rest.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Employee.Annotations.CommonResponses;
import com.Employee.Employee.Annotations.EmployeesAnnotations;
import com.Employee.Employee.Mappers.EmployeeMappers;
import com.Employee.Employee.Rest.Response.EmployeesResponse;
import com.Employee.Employee.Uses.EmployeeUses;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@Validated
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeMappers mapper;
	
	@Autowired
	private EmployeeUses employeeUses;
	
	@Operation(
				summary="Get All Employees",
				description="Get all employees currently present in the system"
			)
	@EmployeesAnnotations
	@CommonResponses
	@GetMapping(path="/allEmployees")
	public EmployeesResponse getEmployees()
	{
		return EmployeesResponse.builder()
		.employees(mapper.domainstoDto(
				employeeUses.getAllEmployees()
				)).build();
	}

}
