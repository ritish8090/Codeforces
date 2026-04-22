import java.util.*;
public class Flip_Flops_2209A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();
                long c = sc.nextLong();
                long k = sc.nextLong();
                long[] a = new long[(int)n];
                for (int i = 0; i < n; i++) a[i] = sc.nextLong();
                Arrays.sort(a);

                boolean progress = true;
                while (progress) {
                    progress = false;
                    for (int i = 0; i < n; i++) {
                        if (a[i] >= 0 && a[i] <= c) {
                            long extra = Math.min(k, c - a[i]);
                            c += a[i] + extra;
                            k -= extra;
                            a[i] = -1;
                            progress = true;
                        }
                    }
                }
                System.out.println(c);
            }
        }
}
