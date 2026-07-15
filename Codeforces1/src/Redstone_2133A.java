import java.io.*;
import java.util.*;
public class Redstone_2133A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());

                HashSet<Integer> seen = new HashSet<>();
                boolean ok = false;

                for (int i = 0; i < n; i++) {
                    int x = Integer.parseInt(st.nextToken());
                    if (!seen.add(x)) ok = true;
                }

                sb.append(ok ? "YES" : "NO").append('\n');
            }

            System.out.print(sb);
        }
}
