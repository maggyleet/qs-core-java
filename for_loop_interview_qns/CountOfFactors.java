package for_loop_interview_qns;

public class CountOfFactors {
    public static void main(String[] args) {

        int gn = 12;
        int count = 0;

        for (int i = 1; i <= gn; i++) {
            if (gn % i == 0) {
                count++;
            }
        }

        System.out.println("Total number of factors of " + gn + " is: " + count);
    }
}
