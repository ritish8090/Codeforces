import java.io.*;
import java.util.*;
public class Twice_2037A {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] cnt = new int[n + 1];

                for (int i = 0; i < n; i++) {
                    cnt[sc.nextInt()]++;
                }

                int ans = 0;
                for (int x : cnt) {
                    ans += x / 2;
                }

                System.out.println(ans);
            }
        }
}
