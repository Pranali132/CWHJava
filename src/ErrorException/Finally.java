package ErrorException;

public class Finally {

	public static void main(String[] args) {
      try {
    	  int a=50;
    	  int b=0;
    	  int c=a/b;
    	  System.out.println(c);
      }catch(Exception e) {
    	  System.out.println(e);

      }
      finally {
    	  System.out.println("Cleaning up Resource");
  
      }
	}

}
