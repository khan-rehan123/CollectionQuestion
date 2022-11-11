package com.collectiom.qustion;

public class StringQuestion12 {
	public static void main(String[] args) {
		String name="mohammad rehan khan";
		if(name.endsWith("an")) {
			ifBlock(name);
		}
		else {
		elseBlock(name);
		}
	}
	public static void elseBlock(String name) {
		System.out.println("called else block");
	}
	public static void ifBlock(String name) {
		System.out.println("called is if block: "+name);
	}

}
