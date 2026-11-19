import java.util.*;
public class Array_merging_1831B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                int[] b = new int[n];
                int[] maxA = new int[2 * n + 1];
                int[] maxB = new int[2 * n + 1];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                for (int i = 0; i < n; i++) {
                    b[i] = sc.nextInt();
                }

                int count = 1;

                for (int i = 0; i < n; i++) {
                    if (i > 0 && a[i] == a[i - 1]) {
                        count++;
                    } else {
                        count = 1;
                    }
                    maxA[a[i]] = Math.max(maxA[a[i]], count);
                }

                count = 1;

                for (int i = 0; i < n; i++) {
                    if (i > 0 && b[i] == b[i - 1]) {
                        count++;
                    } else {
                        count = 1;
                    }
                    maxB[b[i]] = Math.max(maxB[b[i]], count);
                }

                int ans = 0;

                for (int i = 1; i <= 2 * n; i++) {
                    ans = Math.max(ans, maxA[i] + maxB[i]);
                }

                System.out.println(ans);
            }
            sc.close();
        }
}
