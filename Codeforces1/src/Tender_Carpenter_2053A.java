import java.io.*;
import java.util.*;
public class Tender_Carpenter_2053A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

                boolean ok = false;
                for (int i = 0; i + 1 < n; i++) {
                    int mn = Math.min(a[i], a[i + 1]);
                    int mx = Math.max(a[i], a[i + 1]);
                    if (2 * mn > mx) {
                        ok = true;
                        break;
                    }
                }
                out.append(ok ? "YES" : "NO").append('\n');
            }
            System.out.print(out);
        }
}
