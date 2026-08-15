import java.util.*;
public class Maximize_the_Last_Element_1991A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int ans = 0;

                for (int i = 1; i <= n; i++) {
                    int x = sc.nextInt();

                    if (i % 2 == 1) {
                        ans = Math.max(ans, x);
                    }
                }

                System.out.println(ans);
            }
        }
}
