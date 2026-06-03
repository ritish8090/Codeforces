import java.io.*;
import java.util.*;
public class Marisa_Steals_Reimus_Takeout_2228A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                int c0 = 0, c1 = 0, c2 = 0;

                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(st.nextToken());
                    if (x == 0) c0++;
                    else if (x == 1) c1++;
                    else c2++;
                }

                int best = 0;

                for (int pairs = 0; pairs <= Math.min(c1, c2); pairs++) {
                    int cur = pairs + (c1 - pairs) / 3 + (c2 - pairs) / 3;
                    best = Math.max(best, cur);
                }

                out.append(c0 + best).append('\n');
            }

            System.out.print(out);
        }
}
