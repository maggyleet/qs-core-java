package scanner_class;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int start = scn.nextInt();
        System.out.println("Enter ending number: ");
        int end = scn.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                sum += i;
        }

        System.out.println("Sum of even numbers: " + sum);
        scn.close();
    }
}
