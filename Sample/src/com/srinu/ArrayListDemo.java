package com.srinu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		list.add("Srinu");
		list.add("Anu");
		list.add("Srinu");
		list.add(null);
		list.add(null);
		list.add(0, "First");
		Iterator iter = list.iterator();

		System.out.println(list.toString());
	}

}
