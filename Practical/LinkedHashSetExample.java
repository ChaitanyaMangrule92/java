package CollectionEg;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> al = new LinkedHashSet<String>( );
	
		al.add("chaitanya"); 
		al.add("sachin");
		al.add("aditya");
		al.add("shubham"); 
		al.add("chandana");
		al.add("kurba");
		al.add("madhavi"); 
		al.add("shubham");  //cannot take duplicate value
		al.add(null);  //allows null values
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
