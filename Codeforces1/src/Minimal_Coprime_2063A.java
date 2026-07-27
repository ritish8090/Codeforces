import java.io.*;
import java.util.*;
public class Minimal_Coprime_2063A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long l = Long.parseLong(st.nextToken());
                long r = Long.parseLong(st.nextToken());

                long ans = 0;

                if (l <= 1 && 1 <= r) ans++;

                long start = Math.max(l, 2L);
                if (start <= r - 1) ans += r - start;

                out.append(ans).append('\n');
            }

            System.out.print(out);
        }
}
