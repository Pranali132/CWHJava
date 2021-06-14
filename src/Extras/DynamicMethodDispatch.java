package Extras;
class Phone{
	public void showTime() {
		System.out.println("Time is 8pm");
	}
	public void on() {
		System.out.println("Turning on phone...");
		
  }
}
class SmartPhone extends Phone{
	public void music() {
		System.out.println("Playing Music");
  }
	public void on() {
		System.out.println("Turning on Smartphone...");
  }
}
public class DynamicMethodDispatch {
   public static void main(String[] args) {
     Phone obj=new SmartPhone();
     obj.showTime();
     obj.on();
	}

}
