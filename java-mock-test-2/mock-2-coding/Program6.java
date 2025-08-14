import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = scn.nextLine();
        vowels(s1);
        consonants(s1);
        scn.close();
    }

    public static void vowels(String s1) {
        System.out.print("Vowels: ");
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }

    public static void consonants(String s1) {
        System.out.print("Consonants: ");
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }
}
