import java.util.Scanner;

public class OddNumbersRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter range start number: ");
        int num1 = scn.nextInt();
        System.out.println("Enter range end number: ");
        int num2 = scn.nextInt();

        System.out.println("The numbers are:");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
