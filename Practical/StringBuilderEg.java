package Chaitanya;

public class StringBuilderEg {

	public static void main(String[] args) {
		// String s = new String("Chaitanya1");
		
		StringBuilder s = new StringBuilder("Chaitanyaa");//creating object of StringBuilder class
		s.append("Anudip Foundation");//changes string s
		System.out.println(s); //Chaitanyaa  Anudip Foundation
		
		s.insert(0, "Mangrule"); //inserts string at given position
		
		s.replace(0, 3, "Ran"); //replace string from to end position
		
	    s.delete(0, 3); //delete string from start to end position
		
		s.reverse();
		
		System.out.println(s);
		

	}

}
