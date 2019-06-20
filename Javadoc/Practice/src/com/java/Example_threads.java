package com.java;
/**
 * Date : 20/06/2019
 * Example_threads class creates an user thread
 * @author Haneesha.Rongala
 * Version : 1.8
 *
 */
public class Example_threads extends Thread
{
	/**
	 * run method will executes the user logic
	 */
public void run()
{  
	/**
	 *int i is used for iteration
	 */
	int i=0;
	for( i=1;i<=5;i++)
	{  
		try
		{  
			Thread.sleep(500);  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
		System.out.println(i);  
	}  
}  
public static void main(String args[]) throws Exception
{  
	System.out.println("main method start");
	Example_threads t1=new Example_threads();  
	//Example_threads t2=new Example_threads();  
	//Example_threads t3=new Example_threads();  
	t1.start();
	//.start();
/*	try
	{  
		 
	}
	catch(Exception e){System.out.println(e);
	}  */
	
	

	//t3.start(); 
	
	t1.join();
	System.out.println("Haneesha");
	System.out.println("Lakshmi");
	System.out.println("main method ended");

} 
}

