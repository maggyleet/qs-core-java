package day_3;

public class CountOfEvenDigits {
    public static void main(String[] args) {
        int num = 7635857;
        int rem = 0, count = 0;
        while(num > 0){
            rem = num % 10;
            if(rem % 2 == 0){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
}
}
