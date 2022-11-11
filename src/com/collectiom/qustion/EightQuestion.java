package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EightQuestion {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		Collections.addAll(list, "rehan","mohd","noman","najmul");
		System.out.println(list);
		String last=list.get(list.size()-1); //check the last index position value
		System.out.println(last +" last index");
		System.out.println(list.indexOf("rehan"));
//		System.out.println(list.);
//		List<String> list1=new ArrayList<>();
		
		
	}

}
