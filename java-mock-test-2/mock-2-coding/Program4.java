import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the value to find the position:");
        scn.close();
        int key = scn.nextInt();
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println("The key value is present at the position: " + (i + 1));
                return;
            }
        }
        System.out.println("The key value is not found!");
    }
}
