import java.io.*;
import java.util.*;
public class Collatz_Conjecture_2137A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long k = Long.parseLong(st.nextToken());
                long x = Long.parseLong(st.nextToken());

                long ans = x << k; // x * 2^k
                sb.append(ans).append('\n');
            }

            System.out.print(sb);
        }
}
