package scanner_class;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of the rectange: ");
        int length = scn.nextInt();
        System.out.println("Enter breadth of the rectange: ");
        int breadth = scn.nextInt();
        System.out.println("Area Of Rectangle: " + length * breadth);
    }
}