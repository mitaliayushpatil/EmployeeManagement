package com.Employee.Employee.Rest.Response;

import java.util.List;

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

public class EmployeesResponse {
	@NotNull
		private List<EmployeeDto> employees;
}	
