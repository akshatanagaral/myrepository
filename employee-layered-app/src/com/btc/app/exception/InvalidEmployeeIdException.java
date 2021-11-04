package com.btc.app.exception;

public class InvalidEmployeeIdException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InvalidEmployeeIdException()
	{
		
	}
	public InvalidEmployeeIdException(String message)
	{
		super(message);
	}

}
