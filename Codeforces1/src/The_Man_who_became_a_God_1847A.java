import java.util.*;
public class The_Man_who_became_a_God_1847A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int[] diff = new int[n - 1];

                for (int i = 0; i < n - 1; i++) {
                    diff[i] = Math.abs(a[i] - a[i + 1]);
                }

                Arrays.sort(diff);

                int ans = 0;
                for (int i = 0; i < n - k; i++) {
                    ans += diff[i];
                }

                System.out.println(ans);
            }
        }
}
