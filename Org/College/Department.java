package Org.College;

public class Department extends College {
	public void deptname() {
		System.out.println("BCA");
	}
	public static void main(String[] args) {
		Department dep=new Department();
		dep.collegename();
		dep.collegecode();
		dep.collegerank();
		dep.deptname();
	}

}
