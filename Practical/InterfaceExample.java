package Chaitanya;

 class Circlee implements Shapee {
	 
	 @Override
	 public void draw() {
		// TODO Auto-generated method stub
		   double pi = 3.14;
		   double r = 25;
		   double area = pi * r * r;
		   System.out.println("Area of Circle ; " + area);
		   
	 }
 }
 
  class Rectanglee implements Shapee{
	  
	  @Override
	  public void draw() {
		// TODO Auto-generated method stub
		  int length = 10;
		  int breadth = 20;
		  int area = length * breadth;
		   System.out.println("Area of Rectangle is ; " + area);
		  
	  }
  }
  
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circlee c = new Circlee();
		c.draw();
		
		Rectanglee r = new Rectanglee();
		r.draw();

	}

}
