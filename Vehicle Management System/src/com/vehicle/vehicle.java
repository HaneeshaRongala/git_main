package com.vehicle;
abstract class vehicle
{
	// abstract methods
	abstract void start();
	abstract void sensors();
	abstract void stop();
	abstract void enginespeed();
	int speed;
	// concrete method
	void label()
	{
		System.out.println("Vehicle should start");
		System.out.println("Vehicle should stop");
	}
}
