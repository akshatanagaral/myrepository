package com.btc.app.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.btc.app.model.Employee;
import com.btc.app.service.EmployeeService;
import com.btc.app.service.EmployeeServiceImpl;

public class EmployeeAppUI {
	private Scanner scan=new Scanner(System.in);
	private static EmployeeService service;

public EmployeeAppUI() throws SQLException {
	service=new EmployeeServiceImpl();
}
	
public void addEmployee(){
	System.out.println("Enter Employee Details: ");
	System.out.println("Employee Id:");
	int employeeId=scan.nextInt();
	System.out.println("Employee Name:");
	String employeeName=scan.next()+scan.nextLine();
	System.out.println("Employee EmailId:");
	String email=scan.next()+scan.nextLine();
	System.out.println("Employee DOB[yyyy-mm-dd]:");
	String dobString=scan.next()+scan.nextLine();
	
	LocalDate dob=LocalDate.parse(dobString);
	Employee employee=new Employee(employeeId,employeeName,dob,email);
	Employee savedEmployee;
	try {
		savedEmployee = service.addEmployee(employee);
		System.out.println("Employee Added Successfully:");
		System.out.println(savedEmployee);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void showEmployee() {
	System.out.println("Enter Employee Details :  ");
	System.out.print("Employee ID : ");
	int employeeId=scan.nextInt();

	Employee employee=null;
	try {
		employee = service.searchEmployeeById(employeeId);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	System.out.println(employee);
}

public void updateEmployee() throws Exception
{
	System.out.println("Enter Employee Details :  ");
	System.out.print("Employee ID : ");
	int employeeId=scan.nextInt();
	try {
		
		if(employeeId<1000)
		{
			throw new Exception("Enter  EmployeeId : "+employeeId);
		}
	} catch (InputMismatchException e) {
		// TODO: handle exception
		e.getMessage();
		System.out.println("Enter the Integer Value ");
	}
	
	try {
			System.out.print("Employee Name : ");
			String employeeName=scan.next()+scan.nextLine();
			System.out.print("Email : ");
			String email=scan.next()+scan.nextLine();
			System.out.print("Birth Date [yyyy-mm-dd] : ");
			String dobString=scan.next()+scan.nextLine();
			LocalDate dob=LocalDate.parse(dobString);
			Employee employee1= new Employee(employeeId, employeeName, dob, email);
			 service.updateEmployee(employee1);
			 System.out.println("Update Successfully");
					
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

        
}
