package com.btc.app.ui;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeRunner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//2EmployeeAppUI appUI = new EmployeeAppUI();
		EmployeeAppUI appUI=null;
		try {
			appUI = new EmployeeAppUI();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
		System.out.println("Enter option:\n [1-Add Employee] \n [2-Search Employee] \n [3-Update Employee] \n [0-Exit]");
		int option=scan.nextInt();
	  switch(option){
	  case 1:
		  appUI.addEmployee();
		  break;
	  case 2:
		  appUI.showEmployee();
		  break;
	  case 3:
		  appUI.updatemployee();
		  break;
		  
	  case 0:
		 System.exit(1);
		  break;
	  default:
			throw new IllegalArgumentException("Invalid Option: " + option);
	  }
	  System.out.println("\n");
	}

}
}
