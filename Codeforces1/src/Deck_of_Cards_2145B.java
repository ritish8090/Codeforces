import java.util.*;

public class Deck_of_Cards_2145B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();

                int L = 0, R = 0, Q = 0;

                for (char c : s.toCharArray()) {
                    if (c == '0') L++;
                    else if (c == '1') R++;
                    else Q++;
                }

                if (L + R + Q >= n) {
                    for (int i = 0; i < n; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    continue;
                }

                int leftMin = L;
                int rightMin = n - R - 1;

                int leftMax = L + Q;
                int rightMax = rightMin - Q;

                StringBuilder ans = new StringBuilder();

                for (int i = 0; i < n; i++) {
                    if (i < leftMin || i > rightMin) {
                        ans.append('-');
                    } else if (i >= leftMax && i <= rightMax) {
                        ans.append('+');
                    } else {
                        ans.append('?');
                    }
                }

                System.out.println(ans);
            }
        }
}
