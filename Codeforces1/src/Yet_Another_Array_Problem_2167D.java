import java.util.*;
public class Yet_Another_Array_Problem_2167D {
        static long gcd(long a, long b) {
            while (b != 0) {
                long t = a % b;
                a = b;
                b = t;
            }
            return a;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                }

                long ans = -1;

                for (long x = 2; x <= 100; x++) {
                    boolean ok = false;

                    for (long v : a) {
                        if (gcd(v, x) == 1) {
                            ok = true;
                            break;
                        }
                    }

                    if (ok) {
                        ans = x;
                        break;
                    }
                }

                System.out.println(ans);
            }
        }
}
