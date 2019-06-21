package com.demo.employee.service;

import com.demo.employee.domain.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee empDto);
	
	public Employee getEmployeeById (int empId);

}
