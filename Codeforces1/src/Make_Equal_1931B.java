import java.util.*;
public class Make_Equal_1931B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long sum = 0;
                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                    sum += a[i];
                }

                long avg = sum / n;
                long prefix = 0;
                boolean possible = true;

                for (int i = 0; i < n; i++) {
                    prefix += a[i];

                    if (prefix < avg * (i + 1)) {
                        possible = false;
                        break;
                    }
                }

                System.out.println(possible ? "YES" : "NO");
            }
        }
}
