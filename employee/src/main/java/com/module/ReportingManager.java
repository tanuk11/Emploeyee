package com.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ReportingManager {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer rManagerId;
	private String rName;
	private String email;
	
	@OneToOne
	private Employee employee;

	public ReportingManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReportingManager(Integer rManagerId, String rName, String email, Employee employee) {
		super();
		this.rManagerId = rManagerId;
		this.rName = rName;
		this.email = email;
		this.employee = employee;
	}

	public Integer getrManagerId() {
		return rManagerId;
	}

	public void setrManagerId(Integer rManagerId) {
		this.rManagerId = rManagerId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "ReportingManager [rManagerId=" + rManagerId + ", rName=" + rName + ", email=" + email + ", employee="
				+ employee + "]";
	}
	
	
	
	
	

}
