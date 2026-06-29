import java.io.*;
import java.util.*;
public class Towers_of_Boxes_2203A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());

                int maxHeight = d / m + 1;
                int ans = (n + maxHeight - 1) / maxHeight;

                sb.append(ans).append('\n');
            }

            System.out.print(sb);
        }
}
