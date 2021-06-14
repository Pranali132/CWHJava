package OOPS;

abstract class Parent2{
	public Parent2() {
		System.out.println("I am a Constructor");
	}
	public void sayHello() {
		System.out.println("Hello");
   }
	abstract public void greet();
	abstract public void greet2();
	
}
class child2 extends Parent2{
	public void greet() {
		System.out.println("Good Morning");
		}
	public void greet2() {
		System.out.println("Good Evening");
		}
}
abstract class child3 extends Parent2{
	public void th() {
		System.out.println("I am Good");

	}
}
public class AbstractMethod {

	public static void main(String[] args) {
		child2 c=new child2();
		c.greet();
		c.greet2();
       c.sayHello();		
       }
}
