import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int num = scn.nextInt();
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("The reverse number is " + rev);
    }
}