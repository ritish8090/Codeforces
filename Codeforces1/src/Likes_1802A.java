import java.util.*;
public class Likes_1802A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int p = 0, q = 0;

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    if (x > 0) p++;
                    else q++;
                }

                for (int i = 1; i <= n; i++) {
                    int ans = (i <= p) ? i : 2 * p - i;
                    System.out.print(ans + " ");
                }

                System.out.println();

                for (int i = 1; i <= n; i++) {
                    int ans = (i <= 2 * q) ? i % 2 : i - 2 * q;
                    System.out.print(ans + " ");
                }

                System.out.println();
            }

            sc.close();
        }

}
