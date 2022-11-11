package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NineQuestion {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		Collections.addAll(list, "rehan","najmul khan","ibraheem khan","uzair bhai","raihan bhai","kaif khan");
		List<String> list1 = new ArrayList<>();
		for(String s:list) {
		String s1=s.replace("rehan", "abdul");
		System.out.println(s1);
		}
		
	}

}
