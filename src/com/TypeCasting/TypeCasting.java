package com.TypeCasting;
// Writing a program in Java to implement implicit and explicit type casting

public class TypeCasting {

	public static void main(String[] args) {
		// In implicit typecasting, the conversion involves 
		// a smaller data type to the larger type size.
		int varInt = 80;
		float varFloat = varInt;
		
		System.out.println("IMPLICT TYPECASTING:");
		System.out.println(varInt + " --> 'varInt' is Integer type.");
		System.out.println(varFloat + " --> Here, 'varInt' is converted to Float.");
	
		// In explicit typecasting, the conversion involves 
		// a larger data type to the smaller type size.
		float var1 = 20f;
		short varShort = (short) var1;
		System.out.println("EXPLICT TYPECASTING:");
		System.out.println(var1 + " --> 'var1' is Float type.");
		System.out.println(varShort + " --> Here, 'var1' is converted to Short.");
		
	}

}
