package com.Employee.Employee.Core;

import com.Employee.Employee.Entities.Department;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer id;
	private String name;
	private Integer hotelId;
	private Integer deptId;
	private String gender;
	private Department dept;
}
