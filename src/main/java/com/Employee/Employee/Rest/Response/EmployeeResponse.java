package com.Employee.Employee.Rest.Response;

import com.Employee.Employee.Rest.Dto.EmployeeDto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse{

	@NotNull
	private EmployeeDto employee;
}
