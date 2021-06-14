package Collections;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
    ArrayList<Integer> l1=new ArrayList<>();
    l1.add(67);
    l1.add(90);
    l1.add(88);
    
    l1.add(56);
    l1.add(34);
    l1.add(0,1);//here it will add the element at the respective index
    l1.set(0,566);//will set 566 at 0th index by replacing the element
   // l1.clear();
    System.out.println(l1.indexOf(34));
    System.out.println(l1.contains(6));


    System.out.println(l1);

	}

}
