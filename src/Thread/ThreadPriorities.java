package Thread;
class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}
	public void run() {
		while(true) {
			System.out.println("Thank you:"+this.getName());
		}
	}
}

public class ThreadPriorities {
    public static void main(String[] args) {
      MyThr t1=new MyThr("Harry");
      MyThr t2=new MyThr("John");
      MyThr t3=new MyThr("Sunny");
      t1.setPriority(Thread.MIN_PRIORITY);
      t2.setPriority(Thread.MIN_PRIORITY);
      t3.setPriority(Thread.MAX_PRIORITY);
      t1.start();
      t2.start();
      t3.start();

	}

}
