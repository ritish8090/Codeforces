import java.io.*;
import java.util.*;
public class Move_to_the_End_2104B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                long[] a = new long[n];
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int i = 0; i < n; i++) {
                    a[i] = Long.parseLong(st.nextToken());
                }

                long[] prefMax = new long[n];
                prefMax[0] = a[0];

                for (int i = 1; i < n; i++) {
                    prefMax[i] = Math.max(prefMax[i - 1], a[i]);
                }

                long[] suf = new long[n + 1];

                for (int i = n - 1; i >= 0; i--) {
                    suf[n - i] = suf[n - i - 1] + a[i];
                }

                for (int k = 1; k <= n; k++) {
                    long ans = suf[k];

                    if (k < n) {
                        ans = Math.max(ans, suf[k - 1] + prefMax[n - k - 1]);
                    }

                    out.append(ans).append(" ");
                }

                out.append("\n");
            }

            System.out.print(out);
        }
}
