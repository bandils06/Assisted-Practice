//Write a program in Java to demonstrate the uses
//of classes, objects, and the object-oriented pillars in Java

package com.question8;

class Solution {
	public static void main(String[] args) {
		Students s1 = new Students();
		
		s1.setRollNum(1);
		s1.setlName("Binod");
		s1.setfName("Bihari");
		
		System.out.println(s1.getRollNum());
		System.out.println(s1.getfName());
		System.out.println(s1.getlName());
		
		System.out.println(s1);
		
	}
}