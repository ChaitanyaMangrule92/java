package Chaitanya;

public class B {

	  public void disp(int[] a){
	        System.out.println("The int array elements are.....");
	        for(int d:a){
	           
	            System.out.println(d);
	        }
	    }
	    public void Show(String[] s){
	        System.out.println("The String elements are.....");
	        for(String l:s){
	            System.out.println(l);
	        }
	    }
	    public static void main(String arg[]){
	        B b1=new B();
	        int a[]=new int []{12,10,12,98,65};
	        String s[]=new String[]{"raj","method","object"};
	        
	        b1.disp(a);
	        b1.Show(s);
	    }
	}

