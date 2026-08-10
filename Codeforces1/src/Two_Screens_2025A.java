import java.util.*;
public class Two_Screens_2025A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();

            while (q-- > 0) {
                String s = sc.next();
                String t = sc.next();

                int common = 0;
                while (common < s.length() && common < t.length() &&
                        s.charAt(common) == t.charAt(common)) {
                    common++;
                }

                int ans = s.length() + t.length();

                if (common > 0)
                    ans = common + 1 + (s.length() - common) + (t.length() - common);

                System.out.println(ans);
            }
        }
}
