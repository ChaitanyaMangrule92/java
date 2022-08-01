package Lab;

import java.util.Scanner;

class Student{
    int TOTAL_STUDENT=5;
    int TOTAL_FEE=6000;
    Scanner sc=new Scanner(System.in);
   
    int StudentRoll []=new int[TOTAL_STUDENT];
    String StudentName []=new String[TOTAL_STUDENT];
    String Gmail []=new String [TOTAL_STUDENT];
    int fee []=new int[TOTAL_FEE];
    int s1[]=new int [TOTAL_STUDENT];

    void display(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the roll no:");
            StudentRoll [i]=sc.nextInt();

            sc.nextLine();
            System.out.println("Enter the name:");
            StudentName [i]=sc.nextLine();

            System.out.println("TOTAL_FEE=6000");

            System.out.println("Enter the Fees:");
            fee[i]=sc.nextInt();

           

            if(fee[i]<=2000)
            {
               System.out.println("fee increased by 10%"+(TOTAL_FEE+100));
            }
            else if(fee[i]>=2000)
            {
                System.out.println("remaining fee:"+(TOTAL_FEE-fee[i]));
            }
        }
    }
   
}

          public class ss1 {
        	  public static void main(String arg []){
        	        Student s=new Student();
        	        s.display();

        	    }
        	}


