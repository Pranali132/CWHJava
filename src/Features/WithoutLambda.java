package Features;
interface Demo{
	void meth1();
}
class Stud implements Demo{
 public	void meth1() {
		System.out.println("Without lambda.....");
	}
}

public class WithoutLambda {
  public static void main(String[] args) {
	  Demo student=new Stud();
	  student.meth1();
  }
}
