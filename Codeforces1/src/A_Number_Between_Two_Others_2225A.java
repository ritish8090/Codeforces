import java.io.*;
import java.util.*;

public class A_Number_Between_Two_Others_2225A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                long x = Long.parseLong(st.nextToken());
                long y = Long.parseLong(st.nextToken());

                long k = y / x;

                sb.append(k == 2 ? "NO" : "YES").append('\n');
            }

            System.out.print(sb);
        }
}
