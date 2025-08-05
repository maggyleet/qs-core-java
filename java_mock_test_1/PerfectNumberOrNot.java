import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check perfect number: ");
        int num = scn.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println("The number is a perfect number!!");
        } else {
            System.out.println("The number is not a perfect number!!");
        }
        scn.close();
    }
}
