package Chaitanya;

public class StringExample {

	public static void main(String[] args) {
		
		String s ="Chaitanya";//creating steing using literal
		String s1 ="Chaitanya";
		
		System.out.println(s);
		System.out.println(s1);
		//or
		char[]arr = {'c' , 'h' , 'a' , 'i' , 't' , 'a' , 'n' , 'y' , 'a'};
		String s11 = new String(arr);//converting char array to String
		System.out.println(s11);
		//or
		String s3 = new String("Anudip");//creating string usingnew keyword
		String s4 = new String("Anudip");
		 
		System.out.println(s3);
		System.out.println(s4);
		

	}

}
