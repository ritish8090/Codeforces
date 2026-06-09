import java.io.*;
import java.util.*;
public class Convergence_2232A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                TreeMap<Integer, Integer> freq = new TreeMap<>();
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(st.nextToken());
                    freq.merge(x, 1, Integer::sum);
                }

                int less = 0;
                int ans = n;

                for (int f : freq.values()) {
                    int greater = n - less - f;
                    ans = Math.min(ans, Math.max(less, greater));
                    less += f;
                }

                out.append(ans).append('\n');
            }

            System.out.print(out);
        }
}
