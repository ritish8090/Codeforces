import java.io.*;
import java.util.*;
public class Dinner_Time_2102A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                int q = Integer.parseInt(st.nextToken());

                int k = n / p;
                int r = n % p;

                if (r == 0 && m != k * q) {
                    sb.append("NO\n");
                } else {
                    sb.append("YES\n");
                }
            }

            System.out.print(sb);
        }
}
