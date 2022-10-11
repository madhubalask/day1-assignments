package week1.day2;

public class employedetails {
	public void employename() {
		String employename="madhu";
		int EmployeId=345;
		System.out.println("Employe Name= "+employename);
		System.out.println("Employe ID="+EmployeId);
		
	}
	public void EmployeAddress() {
		String EmployeAddress="chennai";
		System.out.println("Employe Address="+EmployeAddress);
	}
	public void EmployeSalary() {
		double EmployeSalary=58905.54;
		System.out.println("Employe salary"+EmployeSalary);
	}
	public void EmployeMobileNo() {
		long employemobileNo=675895795589L;
		System.out.println("Employe Mobile No="+ employemobileNo);
	}
	public static void main(String[]args) {
		employedetails details= new employedetails();
		details.employename();
		details.EmployeAddress();
		details.EmployeSalary();
		details.EmployeMobileNo();
		
		}
	}


