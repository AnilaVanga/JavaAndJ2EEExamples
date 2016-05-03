package com.anila.java.inheritance;

//A subclass which extends for vehicle
class Car extends Vehicle {
	int CC;
	int gears;
	int color;

	void attributescar() {
		// Error due to access violation
		// System.out.println("Speed of Car : " + speed);
		// Error due to access violation
		// System.out.println("Size of Car : " + size);
	}
}