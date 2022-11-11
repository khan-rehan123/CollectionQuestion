package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SevenQuestion {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		Collections.addAll(list, 5,7,8,0,3,1,7,90);
		Collections.sort(list);
		System.out.println(list);
	}

}
