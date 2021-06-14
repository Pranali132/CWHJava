package OOPS;
class Student{
	private int id;
	private String name;
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
}

public class GettersSetters {

	public static void main(String[] args) {
      Student S1=new Student();
      S1.setId(24);
      S1.setName("Harry");
		System.out.println(S1.getId());
		System.out.println(S1.getName());


      
      
	}

}
