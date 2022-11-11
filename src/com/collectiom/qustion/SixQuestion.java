package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SixQuestion {
	public static void main(String[] args) {
		List<List<String>> list=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		Collections.addAll(list1, "rehan","mohd");
		List<String> list2=new ArrayList<>();
		Collections.addAll(list2, "suhel","arbaz");
		Collections.addAll(list, list1,list2);
		System.out.println(list);
		
	}

}
