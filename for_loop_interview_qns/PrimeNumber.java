package for_loop_interview_qns;

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 29;
        int count = 0;

        if (number <= 1) {
            System.out.println(number + " is NOT a Prime Number");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is NOT a Prime Number");
            }
        }
    }
}
