package Array;

public class SumofArray {
	public static void main(String[] args) {
		int [] marks= {23,45,67,89,90,100,76,33,28};
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		System.out.println("the sum of the array is:"+sum);
	}

}
