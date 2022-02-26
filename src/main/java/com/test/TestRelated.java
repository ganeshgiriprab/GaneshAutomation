package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestRelated {

	public static void main(String[] args) {
	RelatedCollectionTwo obj1 = new RelatedCollectionTwo("Ganesh",20,1);
	RelatedCollectionTwo obj2 = new RelatedCollectionTwo("Suma",18,2);
	RelatedCollectionTwo obj3 = new RelatedCollectionTwo("Naga",15,3);
	
	ArrayList<RelatedCollectionTwo> arraylist = new ArrayList<RelatedCollectionTwo>();
	
	arraylist.add(obj1);
	arraylist.add(obj2);
	arraylist.add(obj3);
	 
	Iterator<RelatedCollectionTwo> itr = arraylist.iterator();
	while(itr.hasNext())
	{
		 RelatedCollectionTwo stu = itr.next();
	 System.out.println(stu.StuName);
	 System.out.println(stu.age);
	 System.out.println(stu.rollNum);
	 
	}
	
	
	     
	
		

}

}
