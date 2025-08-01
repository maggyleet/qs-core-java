import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                System.out.println(rem);
            }
            num = num / 10;
        }
    }
}
