import java.util.*;

public class prefixmax_2185b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x > max) {
                    max = x;
                }
            }

            System.out.println((long) max * n);
        }

        sc.close();
    }
}
