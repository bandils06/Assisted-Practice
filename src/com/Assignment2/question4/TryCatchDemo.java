package com.question4;
//Write a program in Java to demonstrate try and catch

public class TryCatchDemo {
	public static void main(String[] args) /*throws InterruptedException*/ {
		try {
		Thread.sleep(5000);
		System.out.println("This line will print after 5 seconds inside try block.");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
