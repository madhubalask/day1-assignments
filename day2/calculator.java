package week1.day2;

public class calculator {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int e,int f) {
        int c=e-f;
        System.out.println(c);
}
	public void multiply(int i,int j) {
		int c=i*j;
		System.out.println(c);
	}
	public void division(int x,int y) {
		int c=x/y;
		System.out.println(c);
	}
public static void main(String[] args) {
	calculator clc=new calculator();
	clc.add(10,20);
	clc.sub(3,6);
	clc.multiply(20, 7);
	clc.division(2, 40);
	
}
}
