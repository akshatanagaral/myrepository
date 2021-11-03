package com.btc.app.model;

import java.time.LocalDate;

public class Employee {
	private int emloyeeId;
	private String employeeName;
	private LocalDate dob;
	private String email;
	public Employee(){
		
	}
	public Employee(int emloyeeId, String employeeName, LocalDate dob, String email) {
		super();
		this.emloyeeId = emloyeeId;
		this.employeeName = employeeName;
		this.dob = dob;
		this.email = email;
	}
	public int getEmployeeId() {
		return emloyeeId;
	}
	public void setEmloyeeId(int emloyeeId) {
		this.emloyeeId = emloyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [emloyeeId=" + emloyeeId + ", employeeName=" + employeeName + ", dob=" + dob + ", email="
				+ email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + emloyeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
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
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (emloyeeId != other.emloyeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}
	
	

}
