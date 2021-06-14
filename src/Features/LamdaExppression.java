package Features;
import java.lang.annotation.*;

interface DemoAno{
	void thisMethod();
}
public class LamdaExppression {

	public static void main(String[] args) {
       DemoAno obj=()->{
    	   System.out.println("This is lamba Expression");
    	   System.out.println("This is Method 1");
       };
       obj.thisMethod();
	}

}
