package com.practicetasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection values = new ArrayList<>();
		values.add(33);
		values.add("abc");
		values.add(23);
		values.add(46);
		
		Collection v1 = new ArrayList<>();
		v1.add(33);
		v1.add("abc");
		v1.add(23);
		v1.add(46);
		
		System.out.println(values);
		values.remove("abc");//removes string abc from list
		System.out.println(values.contains(46));
		System.out.println(values.equals(v1));
	
		
		//values.clear();// list is cleared with all elements
		System.out.println("using iterator to print elements from collection");
		Iterator i = values.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
		System.out.println("using while loop");
		while(i.hasNext()) {// since there are only three elements , nothing is displayed.
			System.out.println(i);
		}
		
		System.out.println("using enhanced for loop or for each loop to print elements from collection");
		for (Object ob: values) {
			System.out.println(ob);
		}
		
	}

}
