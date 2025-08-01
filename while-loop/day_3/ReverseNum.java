package day_3;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 7635857;
        int copy = num;
        int rem = 0, rev = 0;
        while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Original num:"+copy);
        System.out.println("Reversed num:"+rev);
}
}
