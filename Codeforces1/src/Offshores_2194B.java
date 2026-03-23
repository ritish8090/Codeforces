import java.util.*;
public class Offshores_2194B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                long x = sc.nextLong();
                long y = sc.nextLong();

                long[] a = new long[n];

                long totalTransfers = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                    totalTransfers += a[i] / x;
                }

                long ans = 0;

                for (int i = 0; i < n; i++) {

                    long transfersWithoutI = totalTransfers - (a[i] / x);

                    long current = a[i] + transfersWithoutI * y;

                    ans = Math.max(ans, current);
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
