package Chaitanya;

public class StringMethodExample {

	public static void main(String[] args) {
		
		String s = "mangrule chaitanya mangrule";
		System.out.println(s.toUpperCase());//MANGRULE CHAITANYA MANGRULE
		//System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("ch"));//true
		System.out.println(s.endsWith("ya"));
		System.out.println(s.length());//5
		String rs= s.replace("mangrule" , "cm");//replace alloccurances in string
		System.out.println(rs);
		String s1 = "Ramkumar";
		String s2 = "Kumar";
		String s3 = "ramkumar Singh is a good boy. He stays in mumbai";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//false' case do not match
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.compareToIgnoreCase(s3));//0
		System.out.println(s1.compareTo(s2));//positive
		System.out.println(s2.compareTo(s1));//negative
		System.out.println(s2.concat("Kiran"));
		System.out.println(s2.concat("good"));//true
		String[] arr = s3.split("\\s");  //split on whitespace
		for(String a : arr) {
			System.out.println(a);
		}
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(0, 29));
		
		}

	}


