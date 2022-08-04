package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorSortingExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>( );
		
		al.add(new Employee(1, "chaitanya", 987456155, 101));
		al.add(new Employee(2, "ram", 87456155, 103));
		al.add(new Employee(3, "sachin", 887456155, 101));
		al.add(new Employee(4, "jatin", 898745615, 102));
		al.add(new Employee(5, "shubham", 998745615, 105));
		al.add(new Employee(6, "om", 87456155, 104));
		al.add(new Employee(7, "akash", 79876155, 106));
		
		System.out.println("-------------By Name------------------------");
		Collections.sort(al, new EmpNameCompare( )); 
		for(Employee e : al) {
			System.out.println(e.empId + " " +e.empName+ " " +e.empPhone+ " " +e.deptId);
		}
		
        System.out.println();
		System.out.println("-------------By Deptid------------------------");
		Collections.sort(al, new EmpNameCompare( )); 
		for(Employee e : al) {
			System.out.println(e.empId + " " +e.empName+ " " +e.empPhone+ " " +e.deptId);
		}
	}

}
