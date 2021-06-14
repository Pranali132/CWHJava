package OOPS;
class Base1{
	Base1(){
		System.out.println("I am a base class Constructor");
	}
}
class Derived1 extends Base1 {
	Derived1(){
		System.out.println("I am a derived class Constructor");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
      Base1 b=new Base1();
      Derived1 d=new Derived1();
	}

}
