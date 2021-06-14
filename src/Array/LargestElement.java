package Array;

public class LargestElement {

	public static void main(String[] args) {
       int [] marks= {20,78,90,120,89,100,65,98};
       int max=marks[0];
       for(int i=0;i<marks.length;i++) {
    	   if(marks[i]>max) {
    		   max=marks[i];
    		  }
       }
    	   System.out.println("The largest element of the array is:"+max);
       
       
	}

}
