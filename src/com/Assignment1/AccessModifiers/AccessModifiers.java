package com.AccessModifiers;

public class AccessModifiers {

	//Accessed from anywhere.
	public void methodPublic() {
		System.out.println("This is public method");
	}
	//Only accessed within this class.
	private void methodPrivate() {
		System.out.println("This is private method");
	}
	//Accessed within this package.
	void methodDefault() {
		System.out.println("This is default method");
	}
	//Can be accessed outside the package.
	protected void methodProtected() {
		System.out.println("This is protected method");
	}
	
	//same class able to aceess all types of modifiers
	public static void main(String [] args) {
		
		AccessModifiers obj= new  AccessModifiers();
		
		obj.methodDefault();
		obj.methodPrivate();
		obj.methodProtected();
		obj.methodPublic();
		
	
	}
}




