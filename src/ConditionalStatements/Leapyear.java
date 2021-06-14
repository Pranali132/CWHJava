package ConditionalStatements;

public class Leapyear {
	public static void main(String[] args) {    
	    int year=2020;    
	    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
	        System.out.println("LEAP YEAR");  
	    }  
	    else{  
	        System.out.println("COMMON YEAR");  //a year is a leap year if it is divisible by 4 or 400 and not divisible by 100
	    }  
	}    


}
