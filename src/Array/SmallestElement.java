package Array;

public class SmallestElement {

	public static void main(String[] args) {
	       int [] marks= {20,78,90,120,89,100,65,98};
	       int min=marks[0];
	       for(int i=0;i<marks.length;i++) {
	    	   if(marks[i]<min) {
	    		   min=marks[i];
	    		  }
	       }
	    	   System.out.println("The largest element of the array is:"+min);

	}

}
