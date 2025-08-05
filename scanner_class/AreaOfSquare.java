package scanner_class;

import java.util.Scanner;

public class AreaOfSquare {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side of the square: ");
        int side = scn.nextInt();
        System.out.println("Area Of Rectangle: " + side * side);
        scn.close();
    }
}
