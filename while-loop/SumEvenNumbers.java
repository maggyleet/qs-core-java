public class SumEvenNumbers {
    public static void main(String[] args) {
        int i = 43;
        int sum = 0;
        while (i <= 72) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
