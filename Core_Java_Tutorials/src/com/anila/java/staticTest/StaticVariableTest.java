package com.anila.java.staticTest;

class StaticVariableTest {
	static int count = 0;

	public void increment() {
		count++;
	}

	public static void main(String args[]) {
		StaticVariableTest obj1 = new StaticVariableTest();
		StaticVariableTest obj2 = new StaticVariableTest();
		obj1.increment();
		obj2.increment();
		System.out.println("Obj1: count is=" + obj1.count);
		System.out.println("Obj2: count is=" + obj2.count);
	}
}