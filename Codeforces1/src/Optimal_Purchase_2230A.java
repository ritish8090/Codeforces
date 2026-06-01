import java.io.*;
import java.util.*;
public class Optimal_Purchase_2230A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                long n = Long.parseLong(st.nextToken());
                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());

                long ans = n * a;

                long groups = n / 3;
                long rem = n % 3;

                ans = Math.min(ans, groups * b + rem * a);
                ans = Math.min(ans, ((n + 2) / 3) * b);

                sb.append(ans).append('\n');
            }

            System.out.print(sb);
        }
}
