package com.Exceptions;

public class InvalidUserException extends Exception
{
public InvalidUserException(String string, Exception e) 
{
	System.out.println("Entered invalid details to castvote");
	
}
}
