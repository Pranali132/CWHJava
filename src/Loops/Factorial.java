package Loops;
import java.util.Scanner;

public class Factorial {
	public  static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int fact=1;
		int i=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of a number:"+fact);

		
	}

}
