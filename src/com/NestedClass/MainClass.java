package com.NestedClass;


class CLASS {
	class ChildClass {
		String greet() {
			return "Hello!...";
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		CLASS.ChildClass obj = new CLASS().new ChildClass();
		System.out.println(obj.greet());
	}
}
