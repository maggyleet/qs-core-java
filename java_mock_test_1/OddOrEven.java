import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to find odd or even: ");
        int num = scn.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even!!");
        } else {
            System.out.println("The number is odd");
        }
    }
}
