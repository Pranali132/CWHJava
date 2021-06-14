package OOPS;
class Base2{
	Base2(){
		System.out.println("I am a base class Constructor");
	}
		Base2(int x){
			System.out.println("I am a base2 class Constructor"+x);
		}
	}
class Derived2 extends Base2 {
	Derived2(){
		System.out.println("I am a derived class Constructor");
    }
	Derived2(int x,int y){
		System.out.println("I am a derived2 class Constructor"+x+" "+y);
    }
}
public class ConstructorInheritanceOverloading {
  public static void main(String[] args) {
   Base2 b=new Base2(9);
    Derived2 d=new Derived2(34,67);
	}

}
