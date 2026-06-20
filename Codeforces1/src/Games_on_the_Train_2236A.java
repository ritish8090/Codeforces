import java.io.*;
import java.util.*;
public class Games_on_the_Train_2236A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                StringTokenizer st = new StringTokenizer(br.readLine());

                int mn = Integer.MAX_VALUE;
                int mx = Integer.MIN_VALUE;

                for (int i = 0; i < n; i++) {
                    int h = Integer.parseInt(st.nextToken());
                    mn = Math.min(mn, h);
                    mx = Math.max(mx, h);
                }

                sb.append(mx + 1 - mn).append('\n');
            }

            System.out.print(sb);
        }

}
