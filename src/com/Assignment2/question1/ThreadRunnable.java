package com.question1;

//Write a program in Java to create a thread by extending 
//the ‘Thread’ class and by implementing the “Runnable” interface
class Demo extends Thread {
	//Method OverRide
	public void run() {
		System.out.println("This thread is running by extending 'Thread' class...");
	}
}

class Demo2 implements Runnable{
	//Method OverRide
	public void run() {
		System.out.println("This thread is running by implementing 'Runnable' class...");
	}

	public void start() {
		run();
	}
}

public class ThreadRunnable {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.start();
		
		Demo2 r = new Demo2();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		r.start();
		
		String str1 = t1.getName();
		String str2 = t2.getName();
		System.out.println(str1);
		System.out.println(str2);
		
	}
}
