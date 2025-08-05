import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a char to find whether it is vowel or consonant: ");
        char c = scn.nextLine().charAt(0);
        if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
                || c == 'u') {
            System.out.println("The character is a vowel!!");
        } else {
            System.out.println("The character is a consonant!!");
        }
        scn.close();
    }
}
