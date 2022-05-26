package Chaitanya;

public class ObjectExample {

	//defining fields
	 int id;
	 String name;
	 String dept = "IT";
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectExample obj = new ObjectExample(); //creating an object or instance
		ObjectExample obj1 = new ObjectExample();
		
		obj.id = 100;//initializing onjects
		obj.name = "chaitanya";
		
		obj1.id = 101;
		obj1.name = "sarang";
		
		System.out.println(obj.id+" "+obj.name+" "+obj.dept);
		System.out.println(obj1.id+" "+obj1.name+" "+obj.dept);
				

	}

}
