import java.io.*;
import java.util.*;
public class Alternating_String_2225B {
        static boolean check(String s, char first) {
            int n = s.length();

            int l = -1, r = -1;

            for (int i = 0; i < n; i++) {
                char expected = ((i & 1) == 0)
                        ? first
                        : (first == 'a' ? 'b' : 'a');

                if (s.charAt(i) != expected) {
                    if (l == -1) l = i;
                    r = i;
                }
            }

            if (l == -1) return true;

            for (int i = l; i <= r; i++) {
                char expected = ((i & 1) == 0)
                        ? first
                        : (first == 'a' ? 'b' : 'a');

                if (s.charAt(i) == expected) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int T = Integer.parseInt(br.readLine());

            StringBuilder ans = new StringBuilder();

            while (T-- > 0) {
                String s = br.readLine();

                if (check(s, 'a') || check(s, 'b')) {
                    ans.append("YES\n");
                } else {
                    ans.append("NO\n");
                }
            }

            System.out.print(ans);
        }
}
