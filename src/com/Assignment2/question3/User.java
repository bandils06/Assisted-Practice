package com.question3;

public class User extends Thread {
	
	String name;
	String msg;
	Sender sender;
	
	public User(String name,String msg, Sender sender) {
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run() {
		System.out.println(name + "wants to send message : "+msg);
		
		//without synchronization
	    //sender.send(msg);
	    
	    //with synchronization
	    synchronized(sender) {
	    	try {
				sender.send(msg);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
	    }
	}

}