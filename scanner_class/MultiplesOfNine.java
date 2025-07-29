package scanner_class;

import java.util.Scanner;

public class MultiplesOfNine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int start = scn.nextInt();
        System.out.println("Enter ending number: ");
        int end = scn.nextInt();

        System.out.println("Multiples of 9:");
        for (int i = start; i <= end; i++) {
            if (i % 9 == 0)
                System.out.println(i);
        }
    }
}
