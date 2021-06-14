package Thread;
class MyThread1 implements Runnable{
	public void run() {
  	  System.out.println("I am a thread1 not threat1");

	}
}
class MyThread3 implements Runnable{
	public void run() {
	  	  System.out.println("I am a thread2 not threat2");
	  	  }
}
public class ImplementingRunnableInterface {
   public static void main(String[] args) {
   MyThread1 bullet1=new MyThread1();
   Thread gun1=new Thread(bullet1);
   MyThread3 bullet2=new MyThread3();
   Thread gun2=new Thread(bullet2);

   gun1.start();
   gun2.start();

	}

}
