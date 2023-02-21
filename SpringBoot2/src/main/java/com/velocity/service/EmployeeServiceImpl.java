package com.velocity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.entity.Employee;
import com.velocity.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {

		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee;
	}

	@Override
	public List<Employee> getAllEmployee() {

		Iterable<Employee> iterable = employeeRepository.findAll();
		return (List<Employee>) iterable;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		Optional<Employee> response = employeeRepository.findById(id);
		return response.isPresent() ? response.get() : null;
	}

	@Override
	public int updateEmployee(Employee employee) {
		Employee response = employeeRepository.save(employee);
		int id = response.getId();
		return id;
	}

	@Override
	public String deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		return "Employee deleted";
	}
	
	
}
