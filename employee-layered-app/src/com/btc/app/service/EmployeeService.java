package com.btc.app.service;

import java.util.List;

import com.btc.app.model.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee employee) throws Exception;
//	public Employee addEmployee(Employee employee) throws Exception;
public Employee searchEmployeeById(int employeeId) throws Exception;

public boolean deleteEmployeebyId(int employeeId) throws Exception;

public Employee updateEmployee(Employee employee) throws Exception;
public List<Employee> getAllEmployee() throws Exception;

}
