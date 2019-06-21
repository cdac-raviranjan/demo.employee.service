package com.demo.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.employee.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	

	@Override
	public Employee addEmployee(Employee empDto) {
		if(empDto!=null)return empDto;
		else		
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return getListOfEmployee().stream().filter(emp -> emp.getEmployeeId().equals(empId))
	       .findFirst().orElse(null);
		}
	
	
	public List<Employee> getListOfEmployee(){	
		List<Employee> listOfEmployee=new ArrayList<>();
		Employee emp1=new Employee(1, "Ravi", "Sinha", "rr@gmail.com");
		Employee emp2=new Employee(2, "Amit", "Rudraswamy", "aa@gmail.com");
		Employee emp3=new Employee(3, "Kiran", "Kumar", "kk@gmail.com");
		Employee emp4=new Employee(4, "Abhijit", "Mohanty", "mm@gmail.com");
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		listOfEmployee.add(emp4);
		return listOfEmployee;
		
	}

}
