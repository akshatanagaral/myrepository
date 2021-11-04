package com.btc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.btc.app.model.Employee;

public class EmployeeDaoJdbcImpl implements EmployeeDao {
	private Connection con;

	private PreparedStatement smt;
	
	public EmployeeDaoJdbcImpl() throws SQLException {
		con=ConnectionUtil.getDbConnection();
	}

	@Override
	public Employee addEmployee(Employee employee) throws SQLException {

		String dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		String query = "insert into empdb values(?,?,?,?)";

		
		smt= con.prepareStatement(query);

		smt.setInt(1, employee.getEmployeeId());
		smt.setString(2, employee.getEmployeeName());
		smt.setString(3, dateString);
		smt.setString(4, employee.getEmail());

		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return employee;
		}
		return null;
	}

	@Override
	public Employee searchEmployeeById(int employeeId) throws SQLException {
		String query="select * from empdb where employeeId=?";
		smt= con.prepareStatement(query);
		smt.setInt(1, employeeId);
		ResultSet queryResult=smt.executeQuery();
		Employee emp=null;
		if(queryResult.next()){
			emp=new Employee();
			emp.setEmloyeeId(employeeId);
			emp.setEmployeeName(queryResult.getString("employeeName"));
			emp.setEmail(queryResult.getString("email"));
			String dateString=queryResult.getString("dob");
			emp.setDob(LocalDate.parse(dateString));
		}
		return emp;
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) throws SQLException {
	String query="delete from emplyee where employeeId=?";
	smt=con.prepareStatement(query);
	smt.setInt(1, employeeId);
	int deleted=smt.executeUpdate();
	if(deleted==0){
		return false;
	}
	else{
		return false;
	}
	}

	@Override
	public Employee updateEmployee(Employee employee) throws SQLException {
		String query = "UPDATE empdb SET employeeId = ?,employeeName=? ,email =? WHERE employeeId=?";
		String dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		smt= con.prepareStatement(query);
		
		smt.setInt(1, employee.getEmployeeId());
		smt.setString(2, employee.getEmployeeName());
	
		smt.setString(3, employee.getEmail());
		smt.setInt(4, employee.getEmployeeId());
		
		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return employee;
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}





}