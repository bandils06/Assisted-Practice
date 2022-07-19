package com.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// Initialize int type array by directly passing values inside '{}'. 
		int[] arr1 = {4, 33,53,67,0};
		
		// Initialize int type array of size 3 with new keyword.
		// By doing so, we have to assign values to it using indexes.
		int[] arr2 = new int[3];
		arr2[0] = 33;
		arr2[1] = 98;
		arr2[2] = 65;
		// Character type array.
		char[] arr3 = {'a', 'b', 'c'};
		
		// we have couple of methods for arrays which is pre-defined by java
		System.out.println("Size of arr1 is:" +arr1.length);// returns size of an array
		// also we can perform operations with the help of index.
		System.out.println("Before operation: " +arr1[3]);
		arr1[3] = arr1[3]+4*2;
		System.out.println("After operation: " + arr1[3]);
	}

}
