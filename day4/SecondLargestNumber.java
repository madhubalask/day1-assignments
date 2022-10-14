package week1.day4;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[]num= {5,2,9,8,7};
		Arrays.sort(num);
		System.out.println(num[num.length-2]);
	}

}
