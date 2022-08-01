package Chaitanya;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>(); //creating arraylist
		
		al.add("chaitanya"); //adding object in list
		al.add("sachin");
		al.add("aditya");
		al.add(1, "shubham"); //adding objectin list with index value
		al.add("chandana");
		al.add("kurba");
		al.add("madhavi"); 
		al.add("shubham"); //adding duplicate object in list 
		
		System.out.println(al); //printing list object 
		System.out.println(al.size( )); //print length of list
		
		al.add("tejas");
		al.add("dayavan");
		
		al.remove(3); //remove elements on specified index
		
		System.out.println(al.size( ));
		
		System.out.println("traversing using iterator");
		//traversing list using iterator
		Iterator<String> itr = al.iterator(); //getting the iterator
		while(itr.hasNext()) {//check if iterator has elements
			System.out.println(itr.next()); //printing element
		}
			
			System.out.println("travesring using loop");
			//traversing list using for loop
			for(int i=0;i<al.size();i++) {
				System.out.println(al.get(i));
				
				System.out.println("travesring using for each loop");
				//traversing list using for each loop
				for(String a : al) {
					System.out.println(a);
				}
		}
		

	}

}
