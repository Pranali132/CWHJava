package ConditionalStatements;

import java.util.Scanner;

public class ifstatement {
	public static void main(String[] args) {
		System.out.println("Enter your age:");
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		//int age=16;
		if(age>18) {
			System.out.println("You can drive");
		}
		else {
			System.out.println("Ooopsss!!!! Sorry You cannot drive..");

			
		}
	}

}
