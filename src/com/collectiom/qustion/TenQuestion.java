package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.List;



public class TenQuestion {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("rehan");
		list.add("khan");
		if(list.contains("rehan")) {
			System.out.println("name is present ");
		}
		else {
			System.out.println("name is not present ");
		}
		
	}

}
