import java.util.*;

public class Destroying_Towers_2237A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int ans = 0;

            for (int j = 0; j < n; j++) {

                int best = a[j];
                int minBetween = Integer.MAX_VALUE;

                for (int i = j - 1; i >= 0; i--) {

                    minBetween = Math.min(minBetween, a[i + 1]);

                    if (minBetween >= a[i]) {
                        best = Math.min(best, a[i]);
                    }
                }

                ans += best;
            }

            System.out.println(ans);
        }
    }
}
