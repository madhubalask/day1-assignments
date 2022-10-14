package week1.day4;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num= new int[] {1,2,3,5};
		int n=num.length+1;
		int sum=(n*(n+1)/2);
		for(int i=0;i<num.length;i++) {
			sum=sum-num[i];
		}
		System.out.println("Missing number is"+sum);
	}
	}
			    