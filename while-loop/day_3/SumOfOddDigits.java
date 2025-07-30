package day_3;

public class SumOfOddDigits {
    public static void main(String[] args) {
        int num = 7635857;
        int rem = 0, sum = 0;
        while(num > 0){
            rem = num % 10;
            if(rem % 2 != 0){
                sum += rem;
            }
            num = num / 10;
        }
        System.out.println(sum);
}
}
