package com.btc.app.service;

import java.sql.SQLException;
import java.util.List;

import com.btc.app.dao.EmployeeDao;
import com.btc.app.dao.EmployeeDaoImpl;
import com.btc.app.dao.EmployeeDaoJdbcImpl;
import com.btc.app.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao daoObj;
	
	public EmployeeServiceImpl() throws SQLException{
		//daoObj=new EmployeeDaoImpl();
		daoObj=new EmployeeDaoJdbcImpl();
	}

	@Override
	//public Employee addEmployee(Employee employee) {
	public Employee addEmployee(Employee employee) throws Exception {
		return daoObj.addEmployee(employee);
	}
	//}		
	

	@Override
	public Employee searchEmployeeById(int employeeId) throws Exception {
		return daoObj.searchEmployeeById(employeeId);
	}

	@Override
	public boolean deleteEmployeebyId(int employeeId) throws Exception {
		return daoObj.deleteEmployeeById(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws Exception {
		return daoObj.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() throws Exception {
		return daoObj.getAllEmployee();
	}

	

}
