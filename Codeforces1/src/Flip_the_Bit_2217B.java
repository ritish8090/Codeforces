import java.util.*;
import java.io.*;
public class Flip_the_Bit_2217B {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                int[] a = new int[n + 2];
                st = new StringTokenizer(br.readLine());
                for (int i = 1; i <= n; i++) a[i] = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(br.readLine());
                int p = Integer.parseInt(st.nextToken());
                int x = a[p];

                int L = 0, R = 0;
                int prev = 0;
                for (int i = 1; i < p; i++) {
                    int bad = (a[i] != x) ? 1 : 0;
                    if (bad != prev) L++;
                    prev = bad;
                }
                if (prev != 0) L++;

                prev = 0;
                for (int i = n; i > p; i--) {
                    int bad = (a[i] != x) ? 1 : 0;
                    if (bad != prev) R++;
                    prev = bad;
                }
                if (prev != 0) R++;

                sb.append(Math.max(L, R)).append('\n');
            }
            System.out.print(sb);
        }
}
