import java.util.*;
public class Garland_1809A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();

                int[] freq = new int[10];
                int max = 0;

                for (int i = 0; i < s.length(); i++) {
                    freq[s.charAt(i) - '0']++;
                    max = Math.max(max, freq[s.charAt(i) - '0']);
                }

                int n = s.length();

                if (max == n && n > 1) {
                    System.out.println(-1);
                } else {
                    int other = n - max;
                    int ans = n + 2 * Math.max(0, max - other - 1);

                    System.out.println(ans);
                }
            }

            sc.close();
        }
}
