package for_loop_interview_qns;

public class SumOfFactors {
    public static void main(String[] args) {

        int gn = 12;
        int sum = 0;

        for (int i = 1; i <= gn; i++) {
            if (gn % i == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of factors of " + gn + " is: " + sum);
    }
}
