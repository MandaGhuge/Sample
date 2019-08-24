package com.emsrestapi;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeerepository;
	
	
	//List Resource
	@GetMapping("/Employees")
    
	public List<Employee> getAllEmployees()
	{
		 return employeerepository.findAll();
	}
	
	@GetMapping("/Employees/{empId}")
	public Employee getEmployee(@PathVariable Long empId)
	{
		 return employeerepository.findById(empId)
				 .orElseThrow(() -> new EmployeeNotFoundException(empId));
	}
	
	
	//Create Resource
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/Employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee)
	{
	    return employeerepository.save(employee);	
	}
	
	//Update Resource
	@PutMapping("/Employees/{empId}")
	public Employee updateEmployee(@Valid @RequestBody Employee employee,@PathVariable Long empId)
	{
		 return employeerepository.save(employee);
	}
	
	//Delete Resource
	@DeleteMapping
	public void deleteEmployee(@PathVariable Long empId)
	{
		  employeerepository.deleteById(empId);
	}
}
