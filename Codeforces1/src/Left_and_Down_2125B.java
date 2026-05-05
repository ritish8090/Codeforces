import java.util.*;
import java.io.*;
public class Left_and_Down_2125B {
        static long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                long k = Long.parseLong(st.nextToken());

                long g = gcd(a, b);
                sb.append((a / g <= k && b / g <= k) ? 1 : 2).append('\n');
            }

            System.out.print(sb);
        }
}
