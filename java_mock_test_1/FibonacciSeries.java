import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a series length: ");
        int num = scn.nextInt();
        System.out.print("The Fibonacci series: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}
