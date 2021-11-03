package com.btc.app.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.Test;

import com.btc.app.model.Employee;

public class EmployeeDaoImplTest {
	EmployeeDao dao=new EmployeeDaoImpl();

	@Test
	public void testAddEmployee() throws SQLException {
		Employee emp=new Employee(1006,"Uttam Reddy",LocalDate.parse("1994-02-10"),"uttam@gmail.com");

		
			assertEquals(emp, dao.addEmployee(emp));
			//assertEquals(emp, dao.addEmployee(emp));
	}

	@Test
	public void testSearchEmployeeById() {
		//assert(dao.searchEmployeeById(1006)) != null;
	}


//	private void assertGet(Employee searchEmployeeById) {
//		// TODO Auto-generated method stub
//		
//	}

	@Test
	public void testDeleteEmployeeById() {
	
	}

	@Test
	public void testUpdateEmployee() {
	
	}

	@Test
	public void testGetAllEmployee() {
		
	}

}
