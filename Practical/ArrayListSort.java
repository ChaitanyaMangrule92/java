package Chaitanya;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>(); //creating arraylist
		
		al.add("chaitanya"); //adding object in list
		al.add("sachin");
		al.add("aditya");
		al.add("shubham"); 
		al.add("chandana");
		al.add("kurba");
		al.add("madhavi"); 
		al.add("shubham"); 
		
		System.out.println("befor sorting");
		for(String a : al) {
			System.out.println(a);
		}
		
		Collections.sort(al); //sor list
		
		System.out.println();
		System.out.println("after sorting");
		for(String a : al) {
			System.out.println(a);
		}
		
		System.out.println("----------------");
		ArrayList<Integer> all = new ArrayList<Integer>();
		
	     all.add(101);
		 all.add(103);
		 all.add(102);
		 all.add(108);
		 all.add(106);
		 all.add(105);
		 all.add(106);
		 
		 System.out.println("befor sorting");
			for(int a : all) {
				System.out.println(a);
	}
			
			Collections.sort(all); //sor list
			
			System.out.println();
			System.out.println("after sorting");
			for(int a : all) {
				System.out.println(a);
			}		
    	}
	}
