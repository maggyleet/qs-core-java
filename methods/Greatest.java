package methods;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scn.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scn.nextInt();
        System.out.println("The Greatest number: ");
        greatestNum(num1, num2);
    }

    public static void greatestNum(int num1, int num2) {
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
}
