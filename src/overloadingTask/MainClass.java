package overloadingTask;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		FacebookLogin fb = new FacebookLogin();
		System.out.println("1. Phone number\n2. Email");
		System.out.println("Make a choice:");
		int ch = scn.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter phone number:");
			long no = scn.nextLong();
			System.out.println("Enter password:");
			String pwd1 = scn.next();
			fb.login(no, pwd1);
			break;
		case 2:
			System.out.println("Enter email:");
			String email = scn.next();
			System.out.println("Enter password:");
			String pwd2 = scn.next();
			fb.login(email, pwd2);
			break;
		default:
			System.out.println("Invalid choice");
		}
		scn.close();
	}

}
