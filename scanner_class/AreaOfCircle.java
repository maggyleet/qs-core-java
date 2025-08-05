package scanner_class;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius of the cicle: ");
        int radius = scn.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
        scn.close();
    }
}
