import java.util.*;
public class Restore_the_Weather_1833B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                int[] a = new int[n];
                Integer[] b = new Integer[n];
                Integer[] order = new Integer[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    order[i] = i;
                }

                for (int i = 0; i < n; i++) {
                    b[i] = sc.nextInt();
                }

                Arrays.sort(order, (i, j) -> Integer.compare(a[i], a[j]));
                Arrays.sort(b);

                int[] ans = new int[n];

                for (int i = 0; i < n; i++) {
                    ans[order[i]] = b[i];
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(ans[i] + (i == n - 1 ? "\n" : " "));
                }
            }

            sc.close();
        }
}
