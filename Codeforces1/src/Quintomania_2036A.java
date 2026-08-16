import java.util.*;
public class Quintomania_2036A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                boolean ok = true;

                for (int i = 1; i < n; i++) {
                    int diff = Math.abs(a[i] - a[i - 1]);

                    if (diff != 5 && diff != 7) {
                        ok = false;
                        break;
                    }
                }

                System.out.println(ok ? "YES" : "NO");
            }
        }
}
