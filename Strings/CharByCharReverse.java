package Strings;

import java.util.Scanner;

public class CharByCharReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scn.nextLine();
        char ch = '\0';
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            System.out.println(ch);
        }
        scn.close();
    }
}