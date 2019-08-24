package com.emsrestapi;

public class EmployeeNotFoundException extends RuntimeException {
 
	public EmployeeNotFoundException(Long empId)
	{
		super("Employee not found:" +empId);
	}
	
}
