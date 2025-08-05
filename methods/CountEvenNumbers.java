package methods;

import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = scn.nextInt();
        System.out.println("Enter end: ");
        int end = scn.nextInt();
        System.out.println("The count of even numbers: ");
        evenNumbersCount(start, end);
    }

    public static void evenNumbersCount(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
