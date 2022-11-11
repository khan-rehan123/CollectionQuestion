package com.collectiom.qustion;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionProgram {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		Collections.addAll(list, "r","a","b","d","f","n");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println("first time pring elemet"+list);
		System.out.println(list.set(2, "rehan"));
		System.out.println("second time print element "+list);
		System.out.println(list.remove(3));
		System.out.println(list.remove("a"));
		System.out.println("after remeve the element "+list);
		System.out.println(list.size());
		
		
	}

}
