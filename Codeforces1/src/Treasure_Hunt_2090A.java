import java.io.*;
import java.util.*;
public class Treasure_Hunt_2090A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long x = Long.parseLong(st.nextToken());
                long y = Long.parseLong(st.nextToken());
                long a = Long.parseLong(st.nextToken());

                long c = a / (x + y);
                if (c * (x + y) + x >= a + 1) sb.append("NO\n");
                else sb.append("YES\n");
            }
            System.out.print(sb);
        }
}
