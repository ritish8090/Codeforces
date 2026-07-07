import java.io.*;
import java.util.*;
public class Fibonacciness_2060A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int a1 = Integer.parseInt(st.nextToken());
                int a2 = Integer.parseInt(st.nextToken());
                int a4 = Integer.parseInt(st.nextToken());
                int a5 = Integer.parseInt(st.nextToken());

                int[] cand = {
                        a1 + a2,
                        a4 - a2,
                        a5 - a4
                };

                int ans = 0;

                for (int a3 : cand) {
                    int cur = 0;
                    if (a3 == a1 + a2) cur++;
                    if (a4 == a2 + a3) cur++;
                    if (a5 == a3 + a4) cur++;
                    ans = Math.max(ans, cur);
                }

                out.append(ans).append('\n');
            }

            System.out.print(out);
        }
}
