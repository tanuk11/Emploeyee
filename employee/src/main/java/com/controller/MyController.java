package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.EmployeeException;
import com.module.Employee;
import com.module.ReportingManager;
import com.service.EmployeeService;


@RestController
public class MyController {
	
	@Autowired
	private EmployeeService eService;
	
	
	@PostMapping("/addemployee")
	public ResponseEntity<Employee> addEmployee(Employee employee) throws EmployeeException {
		
		Employee addEmp =eService.addEmployee(employee);
		
		return new ResponseEntity<Employee>(addEmp ,HttpStatus.CREATED);
	}
	
	@PostMapping("/addrmanager")
	public ResponseEntity<ReportingManager> addRManager(ReportingManager  rManager)  throws EmployeeException {
		
		ReportingManager rem = eService.addRManager(rManager);
		
		return new ResponseEntity<ReportingManager>(rem ,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/viewemployee/{employeeId}")
	public ResponseEntity<Employee> viewEmployee(@PathVariable("employeeId") Integer employeeId) throws EmployeeException{
		
		
	   Employee viewemp =eService.viewEmployeebyId(employeeId);
		
		
		return new ResponseEntity<Employee>(viewemp, HttpStatus.OK);
	}
	
	@GetMapping("/viewrmanager/{employeeId}")
	public ResponseEntity<ReportingManager> viewRManager(@PathVariable("employeeId") Integer employeeId) throws EmployeeException{
		
	ReportingManager rMan =eService.viewEmployeeReportingManager(employeeId);
		
		
		return new ResponseEntity<ReportingManager>(rMan, HttpStatus.OK);
	}
	

}
