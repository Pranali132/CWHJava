package OOPS;

class Employee{
	int id;
	String name;
	String Address;
	public void printDetails() {
		System.out.println("My id is"+id);
		System.out.println("My name is"+name);
		System.out.println("My Address is"+Address);

		
   }
}
public class CustomClass {
	public static void main(String[] args) {
		Employee harry=new Employee();
		Employee John=new Employee();
        harry.id=1;
		harry.name="CodewithHarry";
		harry.Address="Mumbai";
	//	System.out.println(harry.id);
	//	System.out.println(harry.name);
		John.id=2;
		John.name="JohnCenaa";
		John.Address="Delhi";
	//	System.out.println(John.id);
	//	System.out.println(John.name);
     harry.printDetails();
     John.printDetails();
		



}
}
