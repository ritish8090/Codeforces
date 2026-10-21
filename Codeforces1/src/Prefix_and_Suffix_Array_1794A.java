import java.util.*;
public class Prefix_and_Suffix_Array_1794A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String a = "", b = "";

                for (int i = 0; i < 2 * n - 2; i++) {
                    String s = sc.next();

                    if (s.length() == n - 1) {
                        if (a.isEmpty()) {
                            a = s;
                        } else {
                            b = s;
                        }
                    }
                }

                String rev = new StringBuilder(a).reverse().toString();

                System.out.println(rev.equals(b) ? "YES" : "NO");
            }

            sc.close();
        }
}
