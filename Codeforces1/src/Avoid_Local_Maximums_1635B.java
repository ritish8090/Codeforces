import java.util.*;
public class Avoid_Local_Maximums_1635B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int ans = 0;

                for (int i = 1; i < n - 1; i++) {
                    if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                        if (i + 2 < n &&
                                a[i + 2] > a[i + 1] &&
                                (i + 3 >= n || a[i + 2] > a[i + 3])) {

                            a[i + 1] = Math.max(a[i], a[i + 2]);
                            ans++;
                            i++;
                        } else {
                            a[i] = Math.max(a[i - 1], a[i + 1]);
                            ans++;
                        }
                    }
                }

                System.out.println(ans);

                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }

            sc.close();
        }
}
