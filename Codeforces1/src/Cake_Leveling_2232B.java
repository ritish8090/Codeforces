import java.io.*;
import java.util.*;
public class Cake_Leveling_2232B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());

                long pref = 0;
                long best = Long.MAX_VALUE;

                for (int i = 1; i <= n; i++) {
                    long x = Long.parseLong(st.nextToken());
                    pref += x;

                    best = Math.min(best, pref / i);
                    out.append(best).append(' ');
                }

                out.append('\n');
            }

            System.out.print(out);
        }
}
