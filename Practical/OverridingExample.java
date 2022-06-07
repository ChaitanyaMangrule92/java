package Chaitanya;

//parent class
 class Reversebank{
	 
	 int getRateofInterest(){
		 return 0;
	 }
 }

 // chil class
  class Icici extends Reversebank{
	  
	  //overriding parent method
	  int getRateofInterest() {
		  return 7;
	  }
  }
  
  //child class
   class Axis extends Reversebank{
	   
	   int getRateofInterest() {
		   return 8;
	   }
   }
   
 public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Icici c= new Icici();
		System.out.println("Rate of Interest for ICICI : " +c.getRateofInterest());
		
		Axis a = new Axis();
		System.out.println("Rate of Interest for Axis : " +a.getRateofInterest());
		
	}

}
