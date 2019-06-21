package com.demo.employee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.domain.Employee;
import com.demo.employee.exception.RecordNotFoundException;
import com.demo.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService EmployeeDB; 
	
	@PostMapping(value = "/employees")
	public ResponseEntity<Employee> addEmployee (@Valid @RequestBody Employee employee)
	{
	    EmployeeDB.addEmployee(employee);
	    return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	 
	@GetMapping(value = "/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") int id)
	{
	    Employee employee = EmployeeDB.getEmployeeById(id);
	    
	     
	    if(employee == null) {
	         throw new RecordNotFoundException("Invalid employee id : " + id);
	    }
	    return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

}
