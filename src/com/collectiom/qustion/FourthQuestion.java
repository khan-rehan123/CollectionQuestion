package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourthQuestion {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		Collections.addAll(list, "rehan","mohd","khan","arbaz","suhel");
		System.out.println(list);
		Collections.replaceAll(list, "mohd", "mohammad");
		/*
		 * for(String s:list) { Collections.replaceAll(list, "mohd", "mohammad");
		 * 
		 * }
		 */
		System.out.println(list);
	}
}
