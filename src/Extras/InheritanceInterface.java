package Extras;
interface MySample{
	void meth1();
	void meth2();
}
interface MySample1 extends MySample{
	void meth3();
	void meth4();
}
class MyEmp implements MySample1{
	public void meth1() {
		System.out.println("I am Method 1");
	}
	public void meth2() {
		System.out.println("I am Method 2");
    }
	public void meth3() {
		System.out.println("I am Method 3");
    }
	public void meth4() {
		System.out.println("I am Method 4...");
}
}

public class InheritanceInterface {
    public static void main(String[] args) {
      MyEmp emp=new MyEmp();
      emp.meth1();
      emp.meth2();
      emp.meth3();
      emp.meth4();
      
	}

}
