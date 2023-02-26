package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.module.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee ,Integer>{

	
}
