package BasicPrograms;
import java.util.Scanner;


public class Swapping {

	public static void main(String[] args) {
		  System.out.println("Enter the first number:");
		  Scanner sc=new Scanner (System.in);
		  int a=sc.nextInt();
		  System.out.println("Enter the second number:");
		  int b=sc.nextInt();
		  int temp;
		  temp=a;
		  a=b;
		  b=temp;
		  System.out.println("The first no is:"+a);
		  System.out.println("The second number is:"+b);

		  
		  

		  


	}

}
