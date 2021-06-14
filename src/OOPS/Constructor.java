package OOPS;
class MyEmployee{
	private int id;
	private String name;
	private String address;
	public MyEmployee() {
		 id=78;
		name="Harry";
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
public class Constructor {
    public static void main(String[] args) {
    	MyEmployee ob=new MyEmployee();
		System.out.println(ob.getId());


	}

}
