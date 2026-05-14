import java.util.*;
public class Above_the_Clouds_2121B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                boolean ok = false;

                for (int i = 1; i < n - 1; i++) {
                    char ch = s.charAt(i);

                    if (s.substring(0, i).indexOf(ch) != -1 ||
                            s.substring(i + 1).indexOf(ch) != -1) {
                        ok = true;
                        break;
                    }
                }

                System.out.println(ok ? "Yes" : "No");
            }
        }
}
