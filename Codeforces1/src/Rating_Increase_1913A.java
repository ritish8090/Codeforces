import java.util.*;
public class Rating_Increase_1913A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();
                boolean found = false;

                for (int i = 1; i < s.length(); i++) {
                    String left = s.substring(0, i);
                    String right = s.substring(i);

                    if (right.charAt(0) == '0') {
                        continue;
                    }

                    long a = Long.parseLong(left);
                    long b = Long.parseLong(right);

                    if (a < b) {
                        System.out.println(a + " " + b);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(-1);
                }
            }

            sc.close();
        }
}
