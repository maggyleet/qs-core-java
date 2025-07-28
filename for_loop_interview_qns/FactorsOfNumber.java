package for_loop_interview_qns;

public class FactorsOfNumber {
    public static void main(String[] args) {

        int gn = 12;

        System.out.print("Factors of " + gn + ": ");
        for (int i = 1; i <= gn; i++) {
            if (gn % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
