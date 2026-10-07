import java.util.*;
public class Rumb_Needs_a_Hand_2264A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int prev = n + 1;
                boolean ok = true;

                for (int i = 1; i <= n; i++) {
                    int x = sc.nextInt();

                    if (x != i) {
                        if (x >= prev) {
                            ok = false;
                        }
                        prev = x;
                    }
                }

                System.out.println(ok ? "YES" : "NO");
            }

            sc.close();
        }
}
