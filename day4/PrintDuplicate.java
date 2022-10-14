package week1.day4;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] num={10,20,30,60,80,20,30};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if  (num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}

}
