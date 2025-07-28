package for_loop_interview_qns;

public class FibonacciSeries {
    public static void main(String[] args) {

        int count = 10;
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;

        for (int i = 3; i <= count; i++) {
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}
