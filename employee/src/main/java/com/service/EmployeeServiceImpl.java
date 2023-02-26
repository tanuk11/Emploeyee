package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.EmployeeException;
import com.module.Employee;
import com.module.ReportingManager;
import com.repo.EmployeeRepo;
import com.repo.RManagerRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo eRepo;
	
	@Autowired
	private RManagerRepo rRepo;

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		Optional<Employee> opt = eRepo.findById(employee.getEmployeeId());
		
		if(opt.isPresent()) {
			throw new EmployeeException("Employee already exist");
		}
		
		Employee emp =eRepo.save(employee);
		return emp;
		
	}

	@Override
	public ReportingManager addRManager(ReportingManager rManager) throws EmployeeException {
   Optional<ReportingManager> opt = rRepo.findById(rManager.getrManagerId());
		
		if(opt.isPresent()) {
			throw new EmployeeException("Manager already exist");
		}
		
		ReportingManager rm = rRepo.save(rManager);
		return rm;
	}

	@Override
	public Employee viewEmployeebyId(Integer employeeId) throws EmployeeException {
       Optional<Employee> opt = eRepo.findById(employeeId);
		
		if(!opt.isPresent()) {
			throw new EmployeeException("Employee doesn't exist");
		}
		
		Employee emp =opt.get();
		return emp;
		
	}

	@Override
	public ReportingManager viewEmployeeReportingManager(Integer employeeId) throws EmployeeException {
		 Optional<ReportingManager> opt = rRepo.findById(employeeId);
			
			if(!opt.isPresent()) {
				throw new EmployeeException("Manager doesn't exist");
			}
			
			ReportingManager rm = opt.get();
			return rm;
	}

}
