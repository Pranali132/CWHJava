package Method;

public class Statickeyword {
	static int logic(int x,int y) {
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
		c=logic(a,b);
		System.out.println(c);
		int m=78;
		int n=8;
		int p;
		p=logic(m,n);
		System.out.println(p);

		

	}

}
