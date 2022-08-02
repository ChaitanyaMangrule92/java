package Chaitanya;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> al = new  Vector<String>();
		
		al.add("chaitanya"); 
		al.add("sachin");
		al.add("aditya");
		al.add(1, "shubham"); //adding with index position
		al.add("chandana");
		al.add("kurba");
		al.add("madhavi"); 
		al.add("shubham"); 
		
		
		//traversing using iterator
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		al.remove(3);
		
		System.out.println(al);
		

		al.add("tejas");
		al.add("dayavan");
		
		System.out.println(al.size( ));
		System.out.println(al);

	}

}
