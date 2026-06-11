import java.io.*;
import java.util.*;
public class AWonderful_Contest_2222A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());

                boolean[] dp = new boolean[100 * n + 1];
                dp[0] = true;

                for (int i = 0; i < n; i++) {
                    int a = Integer.parseInt(st.nextToken());
                    int step = 100 / a;

                    boolean[] ndp = new boolean[100 * n + 1];

                    for (int s = 0; s < dp.length; s++) {
                        if (!dp[s]) continue;

                        for (int val = 0; val <= 100; val += step) {
                            if (s + val < ndp.length) {
                                ndp[s + val] = true;
                            }
                        }
                    }

                    dp = ndp;
                }

                boolean ok = true;
                for (int s = 0; s <= 100 * n; s++) {
                    if (!dp[s]) {
                        ok = false;
                        break;
                    }
                }

                out.append(ok ? "Yes" : "No").append('\n');
            }

            System.out.print(out);
        }
}
