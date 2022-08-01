package Lab;

import java.util.Scanner;

public class S1 {

	public static void main(String arg []){
	    int a[]=new int [10];

	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the array element");

	    for(int j=0;j<a.length;j++){
	        a[j]=sc.nextInt();
	    }
	    
	    for(int i=0;i<a.length;i=i+2){
	          System.out.print(a[i]+" ");
	    }
	 }   
	
}
