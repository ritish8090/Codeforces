import java.io.*;
import java.util.*;
public class Cherry_Bomb_2106C {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            StringBuilder out = new StringBuilder();

            while (t-- > 0) {

                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                long k = Long.parseLong(st.nextToken());

                long[] a = new long[n];
                long[] b = new long[n];

                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    a[i] = Long.parseLong(st.nextToken());
                }

                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    b[i] = Long.parseLong(st.nextToken());
                }

                Long x = null;

                for (int i = 0; i < n; i++) {
                    if (b[i] != -1) {
                        long sum = a[i] + b[i];

                        if (x == null) {
                            x = sum;
                        } else if (x != sum) {
                            x = -1L;
                            break;
                        }
                    }
                }

                if (x != null && x == -1L) {
                    out.append(0).append('\n');
                    continue;
                }

                if (x != null) {

                    boolean ok = true;

                    for (int i = 0; i < n; i++) {
                        long val = x - a[i];

                        if (val < 0 || val > k) {
                            ok = false;
                            break;
                        }

                        if (b[i] != -1 && b[i] != val) {
                            ok = false;
                            break;
                        }
                    }

                    out.append(ok ? 1 : 0).append('\n');
                }

                else {

                    long L = 0;
                    long R = Long.MAX_VALUE;

                    for (int i = 0; i < n; i++) {
                        L = Math.max(L, a[i]);
                        R = Math.min(R, a[i] + k);
                    }

                    long ans = Math.max(0, R - L + 1);

                    out.append(ans).append('\n');
                }
            }

            System.out.print(out);
        }
}
