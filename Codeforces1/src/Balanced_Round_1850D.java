import java.util.*;
public class Balanced_Round_1850D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                Arrays.sort(a);

                int maxCount = 1;
                int count = 1;

                for (int i = 1; i < n; i++) {
                    if (a[i] - a[i - 1] <= k) {
                        count++;
                    } else {
                        count = 1;
                    }

                    maxCount = Math.max(maxCount, count);
                }

                System.out.println(n - maxCount);
            }

            sc.close();
        }
}
