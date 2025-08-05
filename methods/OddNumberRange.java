package methods;

import java.util.Scanner;

public class OddNumberRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = scn.nextInt();
        System.out.println("Enter end: ");
        int end = scn.nextInt();
        System.out.println("The odd numbers: ");
        oddNumbers(start, end);
    }

    public static void oddNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
