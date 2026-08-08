import java.util.*;
public class Startup_2036B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                long[] sum = new long[k + 1];

                for (int i = 0; i < k; i++) {
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    sum[b] += c;
                }

                Long[] a = new Long[k];
                int cnt = 0;

                for (int i = 1; i <= k; i++) {
                    if (sum[i] > 0) a[cnt++] = sum[i];
                }

                Arrays.sort(a, 0, cnt, Collections.reverseOrder());

                long ans = 0;
                for (int i = 0; i < Math.min(n, cnt); i++)
                    ans += a[i];

                System.out.println(ans);
            }
        }
}
