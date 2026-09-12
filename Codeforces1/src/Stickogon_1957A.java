import java.util.*;
public class Stickogon_1957A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] freq = new int[101];

                for (int i = 0; i < n; i++) {
                    freq[sc.nextInt()]++;
                }

                int ans = 0;

                for (int i = 1; i <= 100; i++) {
                    ans += freq[i] / 3;
                }

                System.out.println(ans);
            }
        }
}
