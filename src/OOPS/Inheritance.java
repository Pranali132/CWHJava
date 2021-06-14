package OOPS;
class Base{
	public int x;

	public int getX() {
		return x;
	}
public void setX(int x) {
		System.out.println("I am in Base and setting x now");
		this.x = x;
	}
public void printMe() {
		System.out.println("I am Constructor");
   }
}
class Derived extends Base{
	public int y;

	public int getY() {
		return y;
	}
public void setY(int y) {
		this.y = y;
	}
	}
public class Inheritance {
	public static void main(String[] args) {
		Base b=new Base();
		b.printMe();
		b.setX(4);
		System.out.println(b.getX());
		
		Derived d=new Derived();
		d.setY(25);
		d.setX(50);
		System.out.println(d.getY());
		System.out.println(d.getX());



	}

}
