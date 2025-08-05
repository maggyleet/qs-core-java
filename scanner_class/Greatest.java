package scanner_class;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scn.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scn.nextInt();
        if (num1 > num2)
            System.out.println("Greatest num: " + num1);
        else
            System.out.println("Greatest num: " + num2);
        scn.close();
    }
}
