package com.Employee.Employee.Mappers;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Component;

import com.Employee.Employee.Core.Employee;
import com.Employee.Employee.Entities.EmployeeDetail;
import com.Employee.Employee.Rest.Dto.EmployeeDto;

import lombok.NoArgsConstructor;
import lombok.Setter;
@Component
public class EmployeeMappers {

	public Employee entitytoDomain(EmployeeDetail entity)
	{
		return new Employee().builder()
				.id(entity.getId())
				.name(entity.getName())
				.dept(entity.getDept())
				.build();
	}
	public List<Employee> entitiestoDomain( List<EmployeeDetail>entities)
	{
		return entities.stream().map(this::entitytoDomain).collect(Collectors.toList());			
	}
	public EmployeeDetail domaintoEntity(Employee domain)
	{
		return new EmployeeDetail().builder()
				.id(domain.getId())
				.name(domain.getName())
				.dept(domain.getDept())
				.build();
	}
	public List<EmployeeDetail> domainstoEntity( List<Employee>domains)
	{
		return domains.stream().map(this::domaintoEntity).collect(Collectors.toList());			
	}
	public EmployeeDto domaintoDto(Employee domain)
	{
		return new EmployeeDto().builder()
				.id(domain.getId())
				.name(domain.getName())
				.dept(domain.getDept())
				.build();
	}
	public List<EmployeeDto> domainstoDto( List<Employee>domains)
	{
		return domains.stream().map(this::domaintoDto).collect(Collectors.toList());			
	}
	public Employee dtotoDomain(EmployeeDto dto)
	{
		return new Employee().builder()
				.id(dto.getId())
				.name(dto.getName())
				.dept(dto.getDept())
				.build();
	}
	public List<Employee> dtotoDomain( List<EmployeeDto>dtos)
	{
		return dtos.stream().map(this::dtotoDomain).collect(Collectors.toList());			
	}
	public EmployeeDetail dtotoEntity(EmployeeDto dto)
	{
		return new EmployeeDetail().builder()
				.id(dto.getId())
				.name(dto.getName())
				.dept(dto.getDept())
				.build();
	}
	public List<EmployeeDetail> dtostoEntity( List<EmployeeDto>dtos)
	{
		return dtos.stream().map(this::dtotoEntity).collect(Collectors.toList());			
	}
	public EmployeeDto entitytoDto(EmployeeDetail entity)
	{
		return new EmployeeDto().builder()
				.id(entity.getId())
				.name(entity.getName())
				.dept(entity.getDept())
				.build();
	}
	public List<EmployeeDto> entitiestoDto( List<EmployeeDetail>entities)
	{
		return entities.stream().map(this::entitytoDto).collect(Collectors.toList());			
	}
	
}
