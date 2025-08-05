package scanner_class;

import java.util.Scanner;

public class ReverseRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int start = scn.nextInt();
        System.out.println("Enter ending number: ");
        int end = scn.nextInt();

        for (int i = end; i >= start; i--) {
            System.out.println(i + " ");
        }

        scn.close();
    }
}
