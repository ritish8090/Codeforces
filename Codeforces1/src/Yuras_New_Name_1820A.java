import java.util.*;
public class Yuras_New_Name_1820A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();
                int n = s.length();
                int ans = 0;

                if (n == 1 && s.charAt(0) == '^') {
                    System.out.println(1);
                    continue;
                }

                if (s.charAt(0) == '_') ans++;
                if (s.charAt(n - 1) == '_') ans++;

                for (int i = 1; i < n; i++) {
                    if (s.charAt(i) == '_' && s.charAt(i - 1) == '_') {
                        ans++;
                    }
                }

                System.out.println(ans);
            }
            sc.close();
        }
}
