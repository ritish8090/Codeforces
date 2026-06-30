import java.io.*;
import java.util.*;
public class Another_Popcount_Problem_2240A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long n = Long.parseLong(st.nextToken());
                long k = Long.parseLong(st.nextToken());

                long ans = 0;
                long cost = 1;

                while (cost <= n) {
                    long can = n / cost;
                    if (can >= k) {
                        ans += k;
                        n -= k * cost;
                        cost <<= 1;
                    } else {
                        ans += can;
                        break;
                    }
                }

                sb.append(ans).append('\n');
            }

            System.out.print(sb);
        }
}
