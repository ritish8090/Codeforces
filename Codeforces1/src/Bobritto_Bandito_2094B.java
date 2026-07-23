import java.io.*;
import java.util.*;
public class Bobritto_Bandito_2094B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                int left = -l;
                int x = Math.min(left, m);
                int y = m - x;

                out.append(-x).append(" ").append(y).append("\n");
            }

            System.out.print(out);
        }
}
