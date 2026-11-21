import java.util.*;
public class Replace_and_Compress_2276B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();
                int n = s.length();

                int ans = 1;
                boolean increase = false;
                boolean decrease = false;

                for (int i = 1; i < n - 1; i++) {
                    char left = s.charAt(i - 1);
                    char mid = s.charAt(i);
                    char right = s.charAt(i + 1);

                    if (left == mid && mid == right) {
                        increase = true;
                    }

                    if (left == right && mid != left) {
                        decrease = true;
                    }
                }

                if (increase) ans++;
                if (decrease) ans++;

                System.out.println(ans);
            }

            sc.close();
        }
}
