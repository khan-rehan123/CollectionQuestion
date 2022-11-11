package com.collectiom.qustion;
class Parent{
	public void eating(){
		System.out.println("parent is eating ");
	}
}
class Child extends Parent{
	public void eating(){
		System.out.println("child is eating");
	}
}

public class StringQuestion13 {
	public static void main(String[] args) {
		Parent pr= new Child();
		pr.eating();
		
	}

}
