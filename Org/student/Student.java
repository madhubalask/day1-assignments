package Org.student;

import Org.College.*;

public class Student extends Department {
	public void studentname() {
		System.out.println("Madhu");
	}
	public void Studentdept() {
		System.out.println("computer application");
	}
	public void Studentid() {
		System.out.println("cb19s259258");
	}
	public static void main(String[] args) {
		Student std=new Student();
		std.collegename();
		std.collegecode();
		std.collegerank();
		std.deptname();
		std.studentname();
		std.Studentdept();
		std.Studentid();

	}
}
