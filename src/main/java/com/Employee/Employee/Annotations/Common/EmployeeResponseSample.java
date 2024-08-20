package com.Employee.Employee.Annotations.Common;

import com.Employee.Employee.Rest.Response.EmployeeResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseSample {

	private EmployeeResponse result;
}
