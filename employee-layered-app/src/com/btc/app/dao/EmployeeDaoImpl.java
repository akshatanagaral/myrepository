package com.btc.app.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.btc.app.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	 private static Map<Integer,Employee> employees=new HashMap();

	@Override
	public Employee addEmployee(Employee employee) {
		if(employees.containsKey(employee.getEmployeeId())){
		throw new RuntimeException("Duplicate Entry-EmployeeId:"+employee.getEmployeeId());	
		}
		employees.put(employee.getEmployeeId(),employee);
		return employee;
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
		
		return employees.get(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		employees.remove(employeeId);
		return !employees.containsKey(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employees.put(employee.getEmployeeId(),employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emps= new ArrayList (employees.values());
		return emps;
	}

}
