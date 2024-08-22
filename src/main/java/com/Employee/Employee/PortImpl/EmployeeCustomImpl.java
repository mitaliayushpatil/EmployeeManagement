package com.Employee.Employee.PortImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.Employee.Employee.Core.Employee;

@Component
@PropertySource("classpath:application-employee-query.yml")
public class EmployeeCustomImpl {

	@Autowired
	private final JdbcTemplate jdbc = new JdbcTemplate();
	
	/*
	 * @Value("${employeequeries.select}") private String queries; public
	 * List<Employee> viewAllEmployees() { return jdbc.query(queries, new
	 * EmployeeCustomImpl()); }
	 */
	/*
	 * @Override public Employee mapRow(ResultSet rs, int rowNum) throws
	 * SQLException { return Employee.builder() .id(rs.getInt("id"))
	 * .name(rs.getString("Name")) .deptId(String.valueOf(rs.getInt("deptId")))
	 * .build(); }
	 */
	
}
