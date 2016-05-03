package com.anila.java.encapsulation;

public class EncapsulationTestDemo {

	public static void main(String args[]) {
		EncapsulationTest encap = new EncapsulationTest();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");
		System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	}
}