import java.io.*;
import java.util.*;
public class Everything_Everywhere_2226B {
        static int gcd(int a, int b) {
            while (b != 0) {
                int t = a % b;
                a = b;
                b = t;
            }
            return a;
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] p = new int[n];

                for (int i = 0; i < n; i++) {
                    p[i] = Integer.parseInt(st.nextToken());
                }

                long ans = 0;

                for (int i = 0; i + 1 < n; i++) {
                    if (gcd(p[i], p[i + 1]) == Math.abs(p[i] - p[i + 1])) {
                        ans++;
                    }
                }

                out.append(ans).append('\n');
            }

            System.out.print(out);
        }
}
