package week1.day3;

public class FibonicSeries {
	public static void main(String[] args) {
		int m=0,s=1,p,i,ps=5;
		System.out.println(m+" "+s);
		for(i=1;i<ps;i++) {
			p=m+s;
			System.out.println(" "+p);
			m=s;
			s=p;		
	}

}
}








