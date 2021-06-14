package ConditionalStatements;

import java.util.Scanner;

public class Switch {
      public static void main(String[] args) {
    	  System.out.println("Enter your age:");
    	  Scanner sc=new Scanner(System.in);
    	  int age=sc.nextInt();
    	  switch(age)
    	  { 
    	  case 18:
    		  System.out.println("You are going to become an adult");
    		  break;
    	  case 25:
    		  System.out.println("You are going to join a job");
    		  break;
    	 case 60:
   		  System.out.println("You are going to Retire");
   		  break;
   		  default:
    		  System.out.println("Enjoy your life...");
     


    		  
    	  }
      }

}
