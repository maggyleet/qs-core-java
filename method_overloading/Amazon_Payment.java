package method_overloading;

import java.util.Scanner;

class Pay {
    public void payment() {
        System.out.println("payment done via cash on delivery ");
    }

    public void payment(String upi) {
        System.out.println("payment done via upi");
    }

    public void payment(long card_no, int cvv) {
        System.out.println("payment done via card");
    }

    public void payment(String username, String password) {
        System.out.println("payment done via usernamePassword");
    }
}

public class Amazon_Payment {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pay p1 = new Pay();
        System.out.println("1.cash\n2.upi\n3.card\n4.username&password");
        System.out.println("make a choice");
        int ch = scn.nextInt();
        switch (ch) {
            case 1:

                p1.payment();
                break;
            case 2:
                System.out.println("enter upi");
                String upi = scn.next();
                p1.payment(upi);
                break;
            case 3:
                System.out.println("enter cardno");
                long no = scn.nextLong();
                System.out.println("enter cvv");
                int cvv = scn.nextInt();
                p1.payment(no, cvv);
                break;

            case 4:
                System.out.println("enter username:");
                String un = scn.next();
                System.out.println("enter password:");
                String pw = scn.next();
                p1.payment(un, pw);
                break;
            default:
                System.out.println("Invalid choice");
        }
        scn.close();
    }

}