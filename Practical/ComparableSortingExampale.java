package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSortingExampale {

	public static void main(String[] args) {
		
		   
 	   Student s = new Student(1, "jatin", 987456123, 25);
 	   Student s1 = new Student(2, "sachin", 789456123, 28);
 	   Student s2 = new Student(3, "dayavan", 87926123, 22);
 	   Student s3 = new Student(4, "tejas", 998456123, 27);
 	   Student s4 = new Student(5, "shubham", 787456123, 24);
 	   Student s5 = new Student(6, "nikhil", 877456123, 26);
 	   Student s6 = new Student(7, "ram", 987456123, 19);
 	   Student s7 = new Student(8, "anil", 987456123, 30);
 	   Student s8 = new Student(9, "kiran", 987456123, 32);
 	   Student s9 = new Student(10, "kunal", 987456123, 19);
 	   
 	   
 	   ArrayList<Student> al = new ArrayList<Student>( ); //create arraylist of student datatype
 	   
 	   al.add(s);
 	   al.add(s1);
 	   al.add(s2);
 	   al.add(s3);
 	   al.add(s4);
 	   al.add(s5);
 	   al.add(s6);
 	   al.add(s7);
 	   al.add(s8);
 	   al.add(s9);
 	   
 	   Collections.sort(al);  //sort student al.age
 	   
 	   for(Student st : al) {
 		  System.out.println(st.sid+" "+st.sname+" "+st.sphone+ " " + st.age);
 	   }

	}

}
