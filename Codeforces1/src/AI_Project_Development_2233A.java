import java.io.*;
import java.util.*;
public class AI_Project_Development_2233A {
        static long ceilDiv(long a, long b) {
            return (a + b - 1) / b;
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                long n = Long.parseLong(st.nextToken());
                long x = Long.parseLong(st.nextToken());
                long y = Long.parseLong(st.nextToken());
                long z = Long.parseLong(st.nextToken());

                long withoutAI = ceilDiv(n, x + y);

                long withAI;
                long maximOnly = ceilDiv(n, x);

                if (maximOnly <= z) {
                    withAI = maximOnly;
                } else {
                    long remaining = n - x * z;
                    withAI = z + ceilDiv(remaining, x + 10L * y);
                }

                sb.append(Math.min(withoutAI, withAI)).append('\n');
            }

            System.out.print(sb);
        }
}
