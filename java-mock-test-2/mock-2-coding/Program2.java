import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = scn.nextLine();
        palindrome(s1);
        scn.close();
    }

    public static void palindrome(String s1) {
        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }
        if (s1.equals(rev)) {
            System.out.println("Palindrome String");
        } else
            System.out.println("Not a palindrome string");
    }
}
