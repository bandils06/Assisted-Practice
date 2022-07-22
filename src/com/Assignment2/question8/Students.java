package com.question8;

class Students {
	
	//these variables are private now, hence cann't accessable outside this class.
	private int rollNum;
	private String fName;
	private String lName;
	
	// by using concept of Encapsulation, 
	// we can create public getter and setter method to access these outside the class.
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	
	@Override
	public String toString() {
		return "Students [rollNum=" + rollNum + ", fName=" + fName + ", lName=" + lName + "]";
	}
	
	
	public static void main(String[] args) {
		
	}
	
}