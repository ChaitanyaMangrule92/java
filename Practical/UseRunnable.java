package Threadeg;

public class UseRunnable implements Runnable {
	
	  @Override
	  public void run( ) {
		  System.out.println("I am thread with runnable");
	  }

	public static void main(String[] args) {
		
		UseRunnable r = new UseRunnable( );
		Thread t =  new Thread(r);
		
		t.start();
		

	}

}
