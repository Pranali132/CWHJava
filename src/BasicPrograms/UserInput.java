package BasicPrograms;
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
      //  float a = sc.nextFloat();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        System.out.println("Enter number 3:");
        int c =sc.nextInt();
        //float b = sc.nextFloat();

        int sum = a+b+c;
        //float sum = a +b;
        System.out.println("The sum of these numbers is:");
      System.out.println(sum);
     System.out.println("Enter b1");
       //b1=sc.nextInt();
       boolean b1 = sc.hasNextInt();
        System.out.println(b1);
   //     String str = sc.next();
       // String str = sc.nextLine();
        //System.out.println(str);

    }
}



