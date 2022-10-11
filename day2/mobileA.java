package week1.day2;

public class mobileA {
	public void sendmsg() {
		System.out.println("sendmsg");
	}
	public void sharedocument() {
		System.out.println("share documents");
	}
	public void call() {
		System.out.println("call");
	}
	public static void main(String[] args) {
		mobileA act=new mobileA();
		act.sendmsg();
		act.sharedocument();
		act.call();
	}

}
