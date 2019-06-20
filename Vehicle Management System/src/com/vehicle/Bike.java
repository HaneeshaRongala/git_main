package com.vehicle;

public class Bike extends vehicle
{
	private int Bike_id;
	private String Bike_company;
	private int  Bike_maximunspeed;
	private int Bike_sensorid;
	void speed(int max_speed,int min_speed)
	{
		System.out.println("If Bike cross the maximum speed sensor detects and throws  warning");
	}
	void speed(int average_speed)
	{
		System.out.println("Drive your Bike with an average speed" + average_speed);
	}

	public int getBike_id() 
	{
		return Bike_id;
	}
	public void setBike_id(int bike_id) 
	{
		Bike_id = bike_id;
	}
	public String getBike_company()
	{
		return Bike_company;
	}
	public void setBike_company(String bike_company)
	{
		Bike_company = bike_company;
	}
	public int getBike_maximunspeed()
	{
		return Bike_maximunspeed;
	}
	public void setBike_maximunspeed(int bike_maximunspeed)
	{
		Bike_maximunspeed = bike_maximunspeed;
	}
	public int getBike_sensorid()
	{
		return Bike_sensorid;
	}
	public void setBike_sensorid(int bike_sensorid)
	{
		Bike_sensorid = bike_sensorid;
	}
	void start()
	{
		System.out.println("Bike should start");
	}
	void sensors ()
	{
		System.out.println("Bike should be tracked using sensors");
	}	
	void stop()
	{
		System.out.println("Bike should stop");

	}
	void enginespeed ()
	{
		System.out.println("Bike speed can be tracked using engine speed sensor");
	}


}
//Inheritance and encapsulation//



