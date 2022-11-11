package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThridQuestion {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		Collections.addAll(list, "rehan","shuhel","arbaz","kalam");
		Collections.reverse(list);
		System.out.println(list);
	}
}
