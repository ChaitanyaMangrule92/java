package Chaitanya;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList2 {
	
       public static void main(String[] args) {
    	   //create object of student 
    	   
    	   StudentArrayList1 s = new StudentArrayList1(1, "jatin", 987456123);
    	   StudentArrayList1 s1 = new StudentArrayList1(2, "sachin", 789456123);
    	   StudentArrayList1 s2 = new StudentArrayList1(3, "dayavan", 87926123);
    	   StudentArrayList1 s3 = new StudentArrayList1(4, "tejas", 998456123);
    	   StudentArrayList1 s4 = new StudentArrayList1(5, "shubham", 787456123);
    	   StudentArrayList1 s5 = new StudentArrayList1(6, "nikhil", 877456123);
    	   
    	   ArrayList<StudentArrayList1> al = new ArrayList<StudentArrayList1>( ); //create arraylist of student datatype
    	   
    	   al.add(s);
    	   al.add(s1);
    	   al.add(s2);
    	   al.add(s3);
    	   al.add(s4);
    	   al.add(s5);
    	   
    	   
    		System.out.println("----Student List----");
    		Iterator<StudentArrayList1> itr= al.iterator();
    		while(itr.hasNext()) {
    			StudentArrayList1 st=  itr.next();
    			System.out.println(st.sid + " " + st.sname + " " + st.sphone);
    		}
    		
    		al.remove(2);
    		
    		System.out.println("----Student List----");
    		Iterator<StudentArrayList1> itr1= al.iterator();
    		while(itr1.hasNext()) {
    			StudentArrayList1 st=  itr1.next();
    			System.out.println(st.sid+" "+st.sname+" "+st.sphone);
    		}
    		
    		   
    	   }
    	   
       }

