import java.util.*;
public class LuoTianyi_and_the_Palindrome_String_1825A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();
                int n = s.length();
                boolean allSame = true;

                for (int i = 1; i < n; i++) {
                    if (s.charAt(i) != s.charAt(0)) {
                        allSame = false;
                        break;
                    }
                }

                if (allSame) {
                    System.out.println(-1);
                } else {
                    System.out.println(n - 1);
                }
            }
            sc.close();
        }
}
