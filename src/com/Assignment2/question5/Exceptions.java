package com.question5;
//Writing a program in Java to throws, throw, finally, and custom exceptions in Java.

public class Exceptions /*extends Exception*/{
	
	 //throws is used at the place of try-catch block to handle exceptions.
	static void demoThrows() throws Exception {
		Thread.sleep(3000);
		System.out.println("Printing after 3 seconds");
	}
	
	static void demoThrow(int age){
		//'throw' is used to throw any kind of exception.
		if (age<18)
			throw new ArithmeticException("Candidate is not an adult.");
		else System.out.println("Candidate is an adult.");
	}
	
	static void demoFinally() {
		  int[] myNumbers = {1, 2, 3};
		try {
			  System.out.println(myNumbers[2]);
			} catch (Exception e) {
			  System.out.println("Something went wrong."+e);
			} finally {
			  System.out.println("The 'try catch' is finished.");
			}
	}
	
	public static void main(String[] args) throws Exception {
		
		
		try {
			demoThrows();
			demoThrow(13);
			demoFinally();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		 
	}
}
