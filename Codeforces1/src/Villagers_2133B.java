import java.util.*;
public class Villagers_2133B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long[] g = new long[n];

                for (int i = 0; i < n; i++) {
                    g[i] = sc.nextLong();
                }

                Arrays.sort(g);

                long ans = 0;
                long cur = 0;

                for (int i = 0; i < n; i++) {
                    ans += g[i] - cur;
                    cur = g[i] - cur;
                }

                System.out.println(ans);
            }
        }
}
