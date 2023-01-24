package javabasics;

public class InstanceVariable {

	// int id =101; /* Instance Variable */

	static int id = 101; /* Class Variable */

	String name = " USA ";

	public static void main(String[] args) {

		InstanceVariable student = new InstanceVariable();

		System.out.println(InstanceVariable.id);

		System.out.println(student.name);
		
		int height = 60; /* Local Variable */
		
		System.out.println(height);
	}

	public static void Test1() {

		System.out.println(id); /* Accessing Global variable in another method */

	}
}
