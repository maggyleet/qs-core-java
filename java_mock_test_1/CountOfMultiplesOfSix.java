import java.util.Scanner;

public class CountOfMultiplesOfSix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter range start number: ");
        int num1 = scn.nextInt();
        System.out.println("Enter range end number: ");
        int num2 = scn.nextInt();

        int count = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 6 == 0) {
                count++;
            }
        }
        System.out.println("The count of multiples of 6 btw a range: " + count);
    }
}
