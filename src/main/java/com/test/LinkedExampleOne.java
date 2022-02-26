package com.test;
import java.util.LinkedList;

public class LinkedExampleOne {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("C");
		list.add("C++");
		list.add("Java");
		list.add("Python");
		list.add(null);
		//print all values
 System.out.println(list);
 list.addFirst("C");
 System.out.println(list);
 
 list.addLast("JavaScript");
 System.out.println(list);
	}

}
