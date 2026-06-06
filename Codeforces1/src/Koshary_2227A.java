import java.io.*;
import java.util.*;
public class Koshary_2227A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if ((x & 1) == 1 && (y & 1) == 1) {
                    sb.append("NO\n");
                } else {
                    sb.append("YES\n");
                }
            }

            System.out.print(sb);
        }
}
