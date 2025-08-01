import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check prime number: ");
        int num = scn.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("The number is not a prime number!!");
                return;
            }
        }
        System.out.println("The number is a prime number!!");
    }
}
