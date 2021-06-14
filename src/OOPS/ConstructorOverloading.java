package OOPS;
class MyStudent{
	private int id;
	private String name;
	private String address;
	public MyStudent() {
		 id=78;
		name="Harry";
	}
	public MyStudent(String myName,int myId) {
		id=89;
		name="Your name here";
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
    	MyStudent ob=new MyStudent("harry",90);
    	System.out.println(ob.getId());
    	System.out.println(ob.getName());


	}

}
