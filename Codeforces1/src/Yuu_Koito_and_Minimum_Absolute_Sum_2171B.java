import java.util.*;
public class Yuu_Koito_and_Minimum_Absolute_Sum_2171B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                }

                if (a[0] == -1 && a[n-1] == -1) {
                    a[0] = 0;
                    a[n-1] = 0;
                }
                else if (a[0] == -1) {
                    a[0] = a[n-1];
                }
                else if (a[n-1] == -1) {
                    a[n-1] = a[0];
                }

                for (int i = 0; i < n; i++) {
                    if (a[i] == -1) a[i] = 0;
                }

                long ans = Math.abs(a[n-1] - a[0]);

                System.out.println(ans);
                for (long x : a) System.out.print(x + " ");
                System.out.println();
            }
        }
}
