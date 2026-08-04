import java.util.*;
public class Who_Watches_the_Watchpig_2245A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();

                if (2 * k > n) {
                    System.out.println(-1);
                    continue;
                }

                int ans = 0;

                for (int i = 0; i < k; i++) {
                    if (s.charAt(i) == 'L') ans++;
                }

                for (int i = n - k; i < n; i++) {
                    if (s.charAt(i) == 'R') ans++;
                }

                System.out.println(ans);
            }
        }
}
