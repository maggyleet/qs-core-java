package scanner_class;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int start = scn.nextInt();
        System.out.println("Enter ending number: ");
        int end = scn.nextInt();

        System.out.println("Even numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        scn.close();
    }
}
