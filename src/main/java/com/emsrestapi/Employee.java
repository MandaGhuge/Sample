package com.emsrestapi;
import java.math.BigDecimal;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="empId")
	private Long empId;
	
	@Column(name="firstName")
	@NotEmpty(message="Please provide first name")
	 private String firstName;
	
	@Column(name="lastName")
	@NotEmpty(message="Please provide last name")
	private String lastName;
	
	@Column(name="birthdate")
	@NotEmpty(message="Please provide birthdate")
	private String birthDate;
	
	@Column(name="address")
	@NotEmpty(message="Please provide address")
	private String address;
	
	@Column(name="boss")
	@NotEmpty(message="Please provide boss's name")
	private String boss;
	
	@Column
	@NotEmpty(message="Please provide salary")
	private int Salary;
	
	public Employee()
	{
		super();
	}
	public Employee(Long empId,String firstName,String lastName,String birthDate,String address,String boss,int Salary)
	{
		this.empId=empId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthDate=birthDate;
		this.address=address;
		this.boss=boss;
		this.Salary=Salary;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", address=" + address + ", boss=" + boss + ", Salary=" + Salary + "]";
	}

	
	
	
}
