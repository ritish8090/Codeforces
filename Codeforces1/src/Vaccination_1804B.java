import java.util.*;
public class Vaccination_1804B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int d = sc.nextInt();
                int w = sc.nextInt();

                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int ans = 0;
                int i = 0;

                while (i < n) {
                    ans++;

                    int expiry = a[i] + w + d;
                    int count = 0;

                    while (i < n && count < k && a[i] <= expiry) {
                        i++;
                        count++;
                    }
                }

                System.out.println(ans);
            }

            sc.close();
        }
}
