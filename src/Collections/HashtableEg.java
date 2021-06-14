package Collections;
import java.util.*;
public class HashtableEg {
	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();
ht.put(100,"Arun");
ht.put(101, "Ajay");
ht.put(104, "Rithik");
ht.put(104, "Rithik");

ht.put(103, "Pranali");

System.out.println(ht);
ht.remove(101);
System.out.println(ht);


	}


}
