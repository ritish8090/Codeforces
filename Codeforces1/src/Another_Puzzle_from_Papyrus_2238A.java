import java.io.*;
import java.util.*;
public class Another_Puzzle_from_Papyrus_2238A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int T = Integer.parseInt(br.readLine());

            StringBuilder out = new StringBuilder();

            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                long c = Long.parseLong(st.nextToken());

                int[] a = new int[n];
                int[] b = new int[n];

                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) b[i] = Integer.parseInt(st.nextToken());

                long ans = Long.MAX_VALUE;

                boolean ok = true;
                long cost = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] < b[i]) {
                        ok = false;
                        break;
                    }
                    cost += a[i] - b[i];
                }
                if (ok) ans = cost;

                Arrays.sort(a);
                Arrays.sort(b);

                ok = true;
                cost = c;
                for (int i = 0; i < n; i++) {
                    if (a[i] < b[i]) {
                        ok = false;
                        break;
                    }
                    cost += a[i] - b[i];
                }
                if (ok) ans = Math.min(ans, cost);

                out.append(ans == Long.MAX_VALUE ? -1 : ans).append('\n');
            }

            System.out.print(out);
        }
}
