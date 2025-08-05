package scanner_class;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of Fibonacci series: ");
        int n = scn.nextInt();

        int n1 = 0, n2 = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        scn.close();
    }
}
