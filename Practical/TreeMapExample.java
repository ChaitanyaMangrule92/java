package CollectionEg;

import java.util.TreeMap;
import java.util.Map;


public class TreeMapExample {

	public static void main(String[] args) {
		
	Map<Integer,String> al = new TreeMap<Integer,String>( );
		
		al.put(1, "mobile");
		al.put(2, "bottle");
		al.put(3, "pen");
		al.put(4, "pencil");
		al.put(5, "chair");
		al.put(6, "box");  
	//	al.put(null, null); //null pair
		al.put(8, null);     //null value
		al.put(3, "pen");     //duplicate pair
		al.put(7, "bottle");  //duplicatr value
		al.putIfAbsent(9, "marker");
		al.putIfAbsent(2, "bottle");
		
		//traversing map using entrySet() 
		for(Map.Entry<Integer, String> m : al.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
		al.remove(8);
		al.remove(4, "pencil");
		al.replace(5, "table chair");
		
		System.out.println( );
		for(Map.Entry<Integer, String> m : al.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
	}

}

		


