package CollectionEg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> al = new HashSet<String>( );
		
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
		
		al.remove(3);
		
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
