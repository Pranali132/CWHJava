package Thread;
class MyT extends Thread{
      public MyT(String name) {
    	  super(name);
    	  }
      public void run() {
    	  int i=34;
    	  System.out.println("Hello");
    	  }
}

public class ThreadConstructor {
	public static void main(String[] args) {
	    MyT t1 = new MyT("Harry");
	    MyT t2 = new MyT("Ram Mandir");
	    t1.start();
	    t2.start();
	    System.out.println("The id of the thread t is " + t1.getId());
	    System.out.println("The name of the thread t is " + t1.getName());
	    System.out.println("The id of the thread t is " + t2.getId());
	    System.out.println("The name of the thread t is " + t2.getName());

	    


	}

}
