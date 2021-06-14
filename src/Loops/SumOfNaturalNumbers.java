package Loops;
import java.util.Scanner;


public class SumOfNaturalNumbers {
	public static void main(String[] args) {
	System.out.println("Enter the numbers of terms:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int i;
	for(i=1;i<=n;i++) {
		sum=sum+i;
	}
	System.out.println("The sum of enered numbers is:"+sum);
		
		
	

}
}
