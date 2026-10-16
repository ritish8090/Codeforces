import java.util.*;
public class Chemistry_1883B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();

                int[] freq = new int[26];

                for (int i = 0; i < n; i++) {
                    freq[s.charAt(i) - 'a']++;
                }

                int odd = 0;

                for (int count : freq) {
                    if (count % 2 != 0) {
                        odd++;
                    }
                }

                if (odd <= k + 1 && (n - k) % 2 == 1 || odd <= k + 1 && (n - k) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

            sc.close();
        }
}
