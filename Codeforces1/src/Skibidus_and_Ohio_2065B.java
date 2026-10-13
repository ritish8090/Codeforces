import java.util.*;
public class Skibidus_and_Ohio_2065B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();
                boolean found = false;

                for (int i = 0; i < s.length() - 1; i++) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        found = true;
                        break;
                    }
                }

                System.out.println(found ? 1 : s.length());
            }
        }
}
