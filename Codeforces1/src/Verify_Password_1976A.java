import java.util.*;
public class Verify_Password_1976A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                boolean ok = true;
                boolean letterSeen = false;
                char lastDigit = '0';
                char lastLetter = 'a';

                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        if (letterSeen || c < lastDigit) {
                            ok = false;
                            break;
                        }
                        lastDigit = c;
                    } else {
                        letterSeen = true;
                        if (c < lastLetter) {
                            ok = false;
                            break;
                        }
                        lastLetter = c;
                    }
                }

                System.out.println(ok ? "YES" : "NO");
            }
        }
}
