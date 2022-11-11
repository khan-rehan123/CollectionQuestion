package com.collectiom.qustion;

import java.io.IOException;
import java.util.Scanner;
class CostomerException extends Exception{
	CostomerException(String sc){
		super(sc);		
	}
}

public class ExceptionProgram {
	
	public static void main(String[] args) throws IOException , CostomerException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of user: ");
		String name1=sc.nextLine();
		String name="rehan";
		if(name.equals(name1)) {
			System.out.println("you are valid user");
		}
		else {
			throw new CostomerException("wrong user name plese valid name");
			
		}
		System.out.println("thanks for visiting for my shop");
		
		
	}

}
