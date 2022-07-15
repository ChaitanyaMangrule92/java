package Chaitanya;

public class ArrayOperation {

	public void maxMin(){
        int a[]={1,6,4,8,3,4};
        int max=a[0];
        int min=a[0];

        System.out.println("\n\n...Array...");
        for(int a1:a){
            System.out.print(a1+" ");
        }
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max=a[i];
            }
        }
        System.out.println("\nLargest="+max+" ");
 
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("smallest value:"+min+" ");
    }


    public void evenOdd(){
        int ar[]={1,2,3,4,5,6,7,8,9,12,15,77};
        System.out.println("\n\nArray element..");
        for(int l:ar){
          System.out.print(l+" ");  
        }
        System.out.println("\n\nEven Array element..");
        for(int i=1; i<ar.length; i=i+2){
           System.out.print(ar[i]+" ");
        }
        System.out.println("\n\nOdd Array element..");
        for(int i=0; i<ar.length; i=i+2){
            System.out.print(ar[i]+" ");
         }
            
         
          

        
    }
public static void main(String arg[]){
    ArrayOperation ao=new ArrayOperation();
    ao.maxMin();
    ao.evenOdd();
    }

 }
