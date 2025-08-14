import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a nth trms:");
        int num = scn.nextInt();
        fibonacciSeries(num);
        scn.close();
    }

    public static void fibonacciSeries(int num) {
        int f1 = 0, f2 = 1, f3 = f1 + f2;
        System.out.print("The fibonacci series: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(f1 + " ");
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        System.out.println();
    }

}
