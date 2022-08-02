package Chaitanya;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("chaitanya"); 
		al.add("sachin");
		al.add("aditya");
		al.add(1, "shubham"); //adding with index position
		al.add("chandana");
		al.add("kurba");
		al.add("madhavi"); 
		al.add("shubham"); 
		al.addFirst("karan"); //get added at beginning of list
		al.addLast("Rahul"); //get added at end of list
		
		//traversing using iterator
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		al.remove(4);
		
		//traversing using iterator
	 	ListIterator<String> itr1 = al.listIterator();
		System.out.println("--------Forward Direction-----------");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
