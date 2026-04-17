import java.util.*;
import java.io.*;
public class Cake_Collection_2139B {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                long m = Long.parseLong(st.nextToken());
                int[] a = new int[n];
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
                Arrays.sort(a);
                // reverse to descending
                int k = (int) Math.min(n, m);
                long ans = 0;
                for (int j = 0; j < k; j++) {
                    ans += (long) a[n - 1 - j] * (m - j);
                }
                sb.append(ans).append('\n');
            }
            System.out.print(sb);
        }
}
