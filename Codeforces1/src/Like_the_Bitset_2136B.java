import java.util.*;
import java.io.*;
public class Like_the_Bitset_2136B {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                String s = br.readLine().trim();

                boolean possible = true;
                int run = 0;
                for (char c : s.toCharArray()) {
                    if (c == '1') {
                        run++;
                        if (run >= k) { possible = false; break; }
                    } else {
                        run = 0;
                    }
                }

                if (!possible) {
                    sb.append("NO\n");
                    continue;
                }

                int ones = 0;
                for (char c : s.toCharArray()) if (c == '1') ones++;

                int[] p = new int[n];
                int low = 1, high = ones + 1;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') p[i] = low++;
                    else p[i] = high++;
                }

                sb.append("YES\n");
                for (int i = 0; i < n; i++) {
                    sb.append(p[i]);
                    if (i < n - 1) sb.append(' ');
                }
                sb.append('\n');
            }

            System.out.print(sb);
        }
}
