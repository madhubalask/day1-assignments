package week1.day4;

public class FindIntersection {

	public static void main(String[] args) {
			int A[]= {5,3,10,4,1,2};
			int B[]= {1,5,2,10,15,6};
			for(int i=0;i<A.length;i++) {
				for(int j=0;j<B.length;j++) {
				if(A[i]==B[j]) {
					System.out.println(B[j]);
				}
				}
			}
		}
		}
