package com.AccessModifiers;

public class TestAccessModifiers {

	//accessing Accessmodifier methods in different class 
	//with samepackage name
	
	public static void main(String [] args) {		
		AccessModifiers obj= new  AccessModifiers();
			
		obj.methodDefault(); // Default method can be accessed within same package.
		//obj.methodPrivate(); private method we can't access out side of class, its scope is within the class
		obj.methodProtected();// Can be accessed within same package without using extend that class.
		// if protected method is required to access from another package,
		// then the class should extend AccessModifiers class
		obj.methodPublic(); // can be accessed from anywhere.
	}
}
