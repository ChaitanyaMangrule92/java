package Lab;

public class S2 {

	 public static void main(String arg []){
		   int number[]={1,6,12,7,9,5,4,5,};
		   int find=9;
		   boolean found =false;
		   
		   for(int n : number){
		    if(n == find){
		     found = true;
		     break;
		    }
		   }
		   if(found)
		   System.out.println(find+" is found.");
		   else
		   System.out.println(find+"  is not found.");
		}
}
