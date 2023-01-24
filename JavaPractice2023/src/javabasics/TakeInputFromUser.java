package javabasics;

import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) {
		
		 /* Using streams to enter the data at the time of execution */
		
		Scanner sc = new Scanner (System.in);   /* Input Stream- Used to READ the data from the console */
		
		System.out.println(" What is your name .? ");

		String name =sc.nextLine();
		
		System.out.println(" Hello!"+name);
		
		System.out.println(" What is your Age.? ");
		
		int age = sc.nextInt();
		
		System.out.println(" Wow! "+age );
		
		sc.close(); /* Close the Stream */
	}

}
