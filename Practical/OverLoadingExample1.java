package Chaitanya;

  class Calculator1{
	  
	   // Static method 
	    static int calculate1(int num1, int num2) {
	        return num1 * num2;
	    }
	// Static method 
	    static double calculate1(double num1, double num2) {
	    	return num1 * num2;
	    }
  }
  
  
public class OverLoadingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Calculator1.calculate1(45, 60));
		System.out.println(Calculator1.calculate1(45.7, 77.9));

	}

}
