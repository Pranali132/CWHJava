package Extras;
interface MyCamera{
	void takeSnap();
	private void greet() {
			System.out.println("Goood Morning!!!...");
	  }
	default void recordVideo() {
		greet();
		System.out.println("Recording video");
	}
}
interface MyWifi{
	void Connect();
}
class MyCellPhone{
	void callNumber() {
		System.out.println("Calling the person");
}
}
class MySmarty extends MyCellPhone implements MyWifi,MyCamera{
	public void takeSnap() {
		System.out.println("Taking Snap");
     }
	public void Connect() {
		System.out.println("Connecting to wifi..");
 }
	
}
public class DefaultMethods {
 public static void main(String[] args) {
  MySmarty ob=new MySmarty();
  ob.takeSnap();
  ob.Connect();
  ob.recordVideo();
  ob.callNumber();
	}

}
