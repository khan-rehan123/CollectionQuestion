package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class FifthQuestion {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "rehah", "khan", "mohd");

		System.out.println(list);
		list.remove(1);

		System.out.println(list);
	}

}