public class MultiplesOf15 {
    public static void main(String[] args) {
        int i = 101;
        while (i <= 1001) {
            if (i % 15 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
