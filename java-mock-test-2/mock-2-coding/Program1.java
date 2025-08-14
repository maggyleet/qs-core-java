import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        primeNumber(num);
        scn.close();
    }

    public static void primeNumber(int num) {
        if (num == 1) {
            System.out.println("Not a prime Number");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
