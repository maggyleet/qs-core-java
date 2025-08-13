package Strings;

import java.util.Scanner;

public class UppercaseChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scn.nextLine();
        char ch = '\0';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch);
            }
        }
        scn.close();
    }
}
