package com.collectiom.qustion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FristQuestion {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("rehan");
		list.add("suhel");
		list.add("arbaz");
		list.add("kalam");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
