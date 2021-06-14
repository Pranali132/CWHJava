package Thread;
class Thr extends Thread{
	public void run() {
		int i=0;
		while(i<=50) {
			System.out.println("Thank You...");
			i++;
    }
	}
}
class MyThr6 extends Thr{
	public void run() {
		int i=0;
		while(i<=25) {
			System.out.println("Welcome...");
			i++;
    }
	}
}
public class ThreadMethods {
   public static void main(String[] args) {
     Thr t1=new Thr();
     MyThr6 t2=new MyThr6();
     t1.start();
     try {
    	 t1.join();
     }catch(Exception e){
			System.out.println(e);

     }
     t2.start();
	}

}
