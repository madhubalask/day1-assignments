package Org.System;

public class Desktop extends Computer  {
	public void desktopsize() {
		System.out.println("15.6inch");
	}
	public static void main(String[] args) {
		Desktop des=new Desktop();
		des.computermodel();
		des.desktopsize();
	}

}
