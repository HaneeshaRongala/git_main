package com.vehicle;

import java.util.Scanner;

public class Vehicletest
{

	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		vehicle V= new Car();
		V.start();
		V.sensors();
		V.stop();
		V.enginespeed();
		System.out.println("Enter speed ");
		int sp=S.nextInt();
		if(sp>=500) 
		{
			System.out.println("If Car cross the maximum speed sensor detects and throws  warning"+ sp);
		}
		else
		{
			System.out.println("Happy journey");
		}
		((Car) V).speed(sp);
		vehicle V1= new Bike();
		V1.start();
		V1.sensors();
		V1.stop();
		V1.enginespeed();
		((Bike) V1).speed(0);
	}

}
// Inheritance and Abstraction//