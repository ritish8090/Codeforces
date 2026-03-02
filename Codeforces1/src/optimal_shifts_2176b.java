import java.util.*;
public class optimal_shifts_2176b {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                if (!s.contains("0")) {
                    System.out.println(0);
                    continue;
                }

                String ss = s + s;
                int cur = 0, maxZero = 0;

                for (int i = 0; i < ss.length(); i++) {
                    if (ss.charAt(i) == '0') {
                        cur++;
                        maxZero = Math.max(maxZero, cur);
                    } else {
                        cur = 0;
                    }
                }

                System.out.println(Math.min(maxZero, n));
            }
        }

}
