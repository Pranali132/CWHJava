package Method;

public class UsingObject {
	int logic(int x,int y) {
		int z;
		if(x>y) {
			z=x+y;
		}else {
			z=(x+y)*5;
		}
		return z;
	}
	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c;
		UsingObject ob=new UsingObject();
		c=ob.logic(a,b);
		System.out.println(c);
		
		
		
		
	}

}
