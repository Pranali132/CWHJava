package Thread;
class MyThread extends Thread{
	public void run() {
		while(true){
	    	  System.out.println("My Cooking thread");
	    	  System.out.println("I am happy");
	    	  }
	}
}
class MyThread2 extends Thread{
	public void run() {
		while(true) {
	    	  System.out.println(" Chatting Thread");
	    	  System.out.println("I am sad");
       }
	}
}
public class ExtendingThreadClass {

	public static void main(String[] args) {
      MyThread t1=new MyThread();
      MyThread2 t2=new MyThread2();
      t1.start();
      t2.start();
	}

}
