package com.module;

import java.util.Objects;

import javax.annotation.Generated;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private Integer mobile;
	private Integer salary;
	
	@Embedded
	private ReportingManager rManager;
	

	@Override
	public int hashCode() {
		return Objects.hash(email, employeeId, firstName, lastName, mobile, rManager, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(email, other.email) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(rManager, other.rManager)
				&& Objects.equals(salary, other.salary);
	}

	public Employee(Integer employeeId, String firstName, String lastName, String email, Integer mobile, Integer salary,
			ReportingManager rManager) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.salary = salary;
		this.rManager = rManager;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReportingManager getrManager() {
		return rManager;
	}

	public void setrManager(ReportingManager rManager) {
		this.rManager = rManager;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobile=" + mobile + ", salary=" + salary + ", rManager=" + rManager + "]";
	}

	
	
	
	

}
