import java.io.*;
import java.util.*;
public class Final_Verdict_2078A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                st = new StringTokenizer(br.readLine());
                long sum = 0;
                for (int i = 0; i < n; i++) sum += Integer.parseInt(st.nextToken());

                out.append(sum == 1L * n * x ? "YES" : "NO").append('\n');
            }

            System.out.print(out);
        }
}
