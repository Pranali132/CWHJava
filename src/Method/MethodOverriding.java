package Method;
class A{
	public int a;
	public void meth2() {
		System.out.println("I am method of class A"+a);
  }
}
class B extends A{
	public void meth2() {
		System.out.println("I am method of class B"+a);
		System.out.println("I am overriding method of class A");

  }
}
public class MethodOverriding {
   public static void main(String[] args) {
	   A a=new A();
	   a.meth2();
	   B b=new B();
	   b.meth2();

	}

}
