package com.anila.java.inheritance;

//A class to display the attributes of the vehicle
class Vehicle {
	String color;
	private int speed;
	private int size;

	public int getSize() {
		return size;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSize(int i) {
		size = i;
	}

	public void setSpeed(int i) {
		speed = i;
	}
}