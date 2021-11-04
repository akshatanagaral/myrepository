package com.btc.app.exception;

public class InvalidEmployeeNameException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InvalidEmployeeNameException()
	{
		
	}
	public InvalidEmployeeNameException(String message)
	{
		super(message);
	}

}
