package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class SecondQuestion {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		Collections.addAll(list, "rehan","khan","shuhel","arbaz");
		for(String s:list) {
			System.out.println(s);
		}
	}
}
