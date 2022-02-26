package com.test;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample {
public static void main(String[] args) {
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	 arraylist.add(1);
	 arraylist.add(2);
	 arraylist.add(3);
	 arraylist.add(4);
	 arraylist.add(5);
	 arraylist.add(6);
	 arraylist.add(6);
	 
	 
	 System.out.println(arraylist);
	  // Access a element in an arraylit.
	 System.out.println(arraylist.get(4));
	 	 
	 //update an element in arraylist
	 System.out.println(arraylist.set(6, 7));
	 System.out.println(arraylist);
	 
	 // Remove element
	 System.out.println(arraylist.remove(6));
	 System.out.println(arraylist);
	 // count no of elements
	 System.out.println(arraylist.size());
	 
	 
	//System.out.println(arraylist.set(0, 5));
	//for(int i=0;i<arraylist.size();i++)
	//{
		//System.out.println(arraylist.get(i));
	 System.out.println("");
	//}
	 //Iterator<Integer> it = arraylist.iterator();
	// while(it.hasNext())// wether the nextelement is available or not
	 //{
		// it.hasNext();
		 //System.out.println(it.next());
	 }
	  
	

}


