package CollectionEg;

import java.util.TreeSet;
import java.util.Iterator;


public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> al = new TreeSet<String>( );
		
		al.add("chaitanya"); 
		al.add("sachin");
		al.add("aditya");
		al.add("shubham"); 
		al.add("chandana");
		al.add("kurba");
		al.add("madhavi"); 
		al.add("shubham");  //cannot take duplicate value
	//	al.add(null);  //allows null values
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}

		

	


