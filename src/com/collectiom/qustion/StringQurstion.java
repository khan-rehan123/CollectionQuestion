package com.collectiom.qustion;

public class StringQurstion {
	public static void main(String[] args) {
		String name="this is java program for tutorial";
				if(name.startsWith("th")) {
			ifBlock(name);
		}
		else {
			elseBlock(name);
		}
	}
	public static void elseBlock(String name) {
		int length=name.length();
		System.out.println("else block method called: "+length);
	}
	public static void ifBlock(String name) {
		String[] spitl=name.split("\\s");
		System.out.println("if block called");
		for(String s:spitl) {
			System.out.println(s);
		}
	}

}
