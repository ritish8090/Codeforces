import java.util.*;
public class The_Corridor_or_There_and_Back_Again_1872B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int ans = Integer.MAX_VALUE;

                for (int i = 0; i < n; i++) {
                    int d = sc.nextInt();
                    int s = sc.nextInt();

                    int limit = d + (s - 1) / 2;

                    ans = Math.min(ans, limit);
                }

                System.out.println(ans);
            }
        }
}
