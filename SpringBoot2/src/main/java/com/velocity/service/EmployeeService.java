package com.velocity.service;

import java.util.List;

import com.velocity.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(int id);

	int updateEmployee(Employee employee);

	String deleteEmployeeById(int id);
}
