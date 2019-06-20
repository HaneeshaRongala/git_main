package com.vehicle;

import java.util.*;

class Car extends vehicle 
{
	private int Car_id;
	private String Car_company;
	public int  Car_maximunspeed;
	private int Car_sensorid;
	Scanner S= new Scanner(System.in);

	void speed(int max_speed,int min_speed)
	{

		System.out.println("If Car cross the maximum speed sensor detects and throws  warning"+ max_speed +" " + min_speed);
	}
	void speed(int average_speed)
	{
		System.out.println("Drive your Car with an average speed");
	}
	public int getCar_id() 
	{
		return Car_id;
	}
	public void setCar_id(int car_id) 
	{
		Car_id = car_id;
	}
	public String getCar_barnd()
	{
		return Car_company;
	}
	public void setCar_barnd(String car_barnd)
	{
		Car_company = car_barnd;
	}
	/*public int getCar_maximunspeed() {
		//return Car_maximunspeed;//
	}*/
	public void setCar_maximunspeed(int car_maximunspeed) 
	{
		Car_maximunspeed = car_maximunspeed;
	}
	public int getCar_sensorid() 
	{
		return Car_sensorid;
	}
	public void setCar_sensorid(int car_sensorid)
	{
		Car_sensorid = car_sensorid;
	}
	void start()
	{
		System.out.println("Car should start");
	}
	void sensors ()
	{
		System.out.println("Car should be tracked using sensors");
	}	
	void stop()
	{
		System.out.println("Car should stop");

	}
	void enginespeed ()
	{
		System.out.println("Car speed can be tracked using engine speed sensor");
	}
}

// Inheritance and Encapsulation //
//Polymorphism (overloading and overriding)//