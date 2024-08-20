package com.Employee.Employee.Repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Employee.Employee.Entities.EmployeeDetail;
@Repository
public interface EmployeeRepository  extends CrudRepository<EmployeeDetail, Integer> {

}
