package javabasics;

public class Bank {

	static int currentBalance = 1000;

	public static void greetCustomer() {

		System.out.println(" Hello, Welcome to Bank of India.! ");

	}

	public void deposit(int amount) {

		currentBalance = currentBalance + amount;

		System.out.println("Amount is deposited successfully");

	}

	public static void withdrawl(int amount) {

		currentBalance = currentBalance - amount;

		System.out.println("Amount is withdrawn successfully");
	}

	public int currentBalance() {

		return currentBalance;

	}

	public static void main(String[] args) {

		Bank bank = new Bank(); /* Calling Deposit Method */

		greetCustomer(); /* Calling greetCustomer Method */

		System.out.println(" Current Balance is " + bank.currentBalance());

		bank.deposit(500);

		System.out.println(" Current Balance is " + bank.currentBalance());

		withdrawl(300); /* Calling withdrawl Method */

		System.out.println(" Current Balance is " + bank.currentBalance());

	}

}
