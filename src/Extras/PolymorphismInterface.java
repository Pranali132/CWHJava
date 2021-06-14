package Extras;
interface MyCamera1{
	void takeSnap();
	private void greet() {
			System.out.println("Goood Morning!!!...");
	  }
	default void recordVideo() {
		greet();
		System.out.println("Recording video");
	}
}
interface MyWifi1{
	void Connect();
}
class MyCellPhone1{
	void callNumber() {
		System.out.println("Calling the person");
}
}
class MySmarty1 extends MyCellPhone1 implements MyWifi1,MyCamera1{
	public void takeSnap() {
		System.out.println("Taking Snap");
     }
	public void Connect() {
		System.out.println("Connecting to wifi..");
 }
	
	
}
public class PolymorphismInterface {
   public static void main(String[] args) {
    MyCamera1 cam=new MySmarty1();
    cam.recordVideo();//you can only use camera methods
    //cam.Connect();//you cannot use any other methods
    MySmarty1 s=new MySmarty1();
    s.takeSnap();
    s.Connect();
	}

}
