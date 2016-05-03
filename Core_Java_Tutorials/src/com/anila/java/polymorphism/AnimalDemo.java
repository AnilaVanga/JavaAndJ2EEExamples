package com.anila.java.polymorphism;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		a1.makeNoise(); // Prints Meowoo

		Animal a2 = new Dog();
		a2.makeNoise(); // Prints Bark

		Animal a3 = new Pig();
		a3.makeNoise(); // Prints Some sound

	}
}