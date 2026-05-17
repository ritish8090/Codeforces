import java.util.*;
public class Not_Quite_a_Palindromic_String_2114B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                String s = sc.next();

                int zero = 0, one = 0;

                for (char c : s.toCharArray()) {
                    if (c == '0') zero++;
                    else one++;
                }

                int pairs = n / 2;
                int bad = pairs - k;

                if (zero >= bad &&
                        one >= bad &&
                        (zero - bad) % 2 == 0 &&
                        (one - bad) % 2 == 0) {

                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
}
