package Chaitanya;

  abstract class Shape{
	  
	  abstract void calculateArea();//abstract method
  }
  
  // child class which inherits abstract class
   class Circle extends Shape{
	   
	   @Override
	   void calculateArea() {//override from parent class
			// TODO Auto-generated method stub
		   
		   double pi = 3.14;
		   double r = 25;
		   double area = pi * r * r;
		   System.out.println("Area of Circle ; " + area);
		   
	   }
   }
   
// child class which inherits abstract class
   class Rectangle extends Shape{
		  
		  @Override
		  public void calculateArea() {
			// TODO Auto-generated method stub
			  int length = 10;
			  int breadth = 20;
			  int area = length * breadth;
			   System.out.println("Area of Rectangle is ; " + area);
		  }
   }
			  
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		c.calculateArea();
		
		Rectangle r = new Rectangle();
		r. calculateArea();


	}

}
