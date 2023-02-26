package com.service;

import org.springframework.stereotype.Service;

import com.exception.EmployeeException;
import com.module.Employee;
import com.module.ReportingManager;

@Service
public interface EmployeeService {

	
	public Employee addEmployee(Employee employee) throws EmployeeException;
	
	public ReportingManager addRManager(ReportingManager rManager) throws EmployeeException;
	
	public Employee viewEmployeebyId(Integer employeeId)throws EmployeeException;
	
	public ReportingManager viewEmployeeReportingManager(Integer employeeId)throws EmployeeException;
	
	
	
}
