package com.Exceptions;
import java.util.Scanner;
public class Castvote
{
	public static void main(String[] args) throws InvalidUserException
	{
	try
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the username to Vote :");
		String userName = scanner.nextLine();
		System.out.println("Enter the voterid number:");
		int voterid = scanner.nextInt();
		int vid = 1234567899;
		System.out.println("enter the age");
		int usrAge=scanner.nextInt();
		int age = 18;
		if (userName.equals("Haneesha") && usrAge>=age)
		    System.out.println("Valid username entered");
		else
			throw new Exception();
	}
	catch (Exception e)
	{
        throw new InvalidUserException("Entered invalid details to castvote", e);
    }
	}
}
	

		


