package for_loop_interview_qns;

public class PerfectNumber {
    public static void main(String[] args) {

        int number = 28;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is NOT a Perfect Number");
        }
    }
}
