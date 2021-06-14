package Collections;
import java.util.*;

public class QueueEg {
	public static void main(String[] args) 
	{
		
	Queue q = new PriorityQueue();
	q.offer("c");
	q.offer("b");
	q.offer("a");
	q.offer("Mumbai");
	
	System.out.println("the elements is:"+q);
	System.out.println("top element is:"+q.peek());
	System.out.println("delete element is:"+q.poll());
	System.out.println("the elements is:"+q);
	}



}
