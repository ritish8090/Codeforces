import java.io.*;
import java.util.*;
public class Divide_and_Conquer_2241A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                sb.append(x % y == 0 ? "YES" : "NO").append('\n');
            }

            System.out.print(sb);
        }
}
