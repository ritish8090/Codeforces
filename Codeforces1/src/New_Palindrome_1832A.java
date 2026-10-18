import java.util.*;
public class New_Palindrome_1832A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();
                boolean possible = false;

                for (int i = 1; i < s.length() / 2; i++) {
                    if (s.charAt(i) != s.charAt(0)) {
                        possible = true;
                        break;
                    }
                }

                System.out.println(possible ? "YES" : "NO");
            }

            sc.close();
        }
}
