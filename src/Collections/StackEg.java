package Collections;
import java.util.*;

public class StackEg {
	public static void main(String[] args) 
	{
		Stack st=new Stack();
		st.push("java");
		st.push("latest");
		st.push("edition");
		st.push("-fifth");
		System.out.println("the elements in the stack:"+st);
		System.out.println("the elements at the top:"+st.peek());
		System.out.println("the elements poped out of the stack:"+st.pop());
		System.out.println("the elements in the stack:"+st);
		System.out.println("the resulting of searching:"+st.search("latest"));

	}


}
