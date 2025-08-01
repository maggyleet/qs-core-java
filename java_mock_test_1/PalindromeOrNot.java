import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome: ");
        int num = scn.nextInt();
        int copy = num;
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (rev == copy) {
            System.out.println("The number is a palindome!!");
        } else {
            System.out.println("The number is not a palindome!!");
        }
    }

}
