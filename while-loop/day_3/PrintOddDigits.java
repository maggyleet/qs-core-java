package day_3;

public class PrintOddDigits {
    public static void main(String[] args) {
        int num = 7635857;
        int rem = 0;
        while(num > 0){
            rem = num % 10;
            if(rem % 2 != 0){
                System.out.println(rem);
            }
            num = num / 10;
        }
    }
}
