package Chaitanya;

 import java.util.Scanner;
 
  class Calculator{
	  
	  //static method with two argument
	  static int calculate(int num1, int num2) {
		  return num1 * num2;
	  }
	  
	  //static method with 3 argument
	  static int calculate(int num1, int num2, int num3) {
		  return num1 * num2 * num3;
	  }
	  
  }
public class OverLoadingExamle {

	public static void main(String[] args) {
		// user input
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Num1");
	        int num1= sc.nextByte();
	        System.out.println("Enter Num2");
	        int num2= sc.nextInt();
	        System.out.println("Enter Num3");
	        int num3= sc.nextInt();
	    
	        System.out.println("Multiplication of two number is:" + Calculator.calculate(num1,num2));
	        System.out.println("Multiplication of three number is:"+Calculator.calculate(num1,num2,num3));
	    }
}

	


