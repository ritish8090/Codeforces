import java.io.*;
import java.util.*;
public class Lawn_Mower_2194A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long n = Long.parseLong(st.nextToken());
                long w = Long.parseLong(st.nextToken());

                sb.append(n - n / w).append('\n');
            }

            System.out.print(sb);
        }

}
