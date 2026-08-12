import java.util.*;
public class RobinHelps_2014A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                int gold = 0;
                int ans = 0;

                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();

                    if (a >= k) {
                        gold += a;
                    } else if (a == 0 && gold > 0) {
                        gold--;
                        ans++;
                    }
                }

                System.out.println(ans);
            }
        }
}
