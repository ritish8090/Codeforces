import java.io.*;
import java.util.*;
public class Lasers_2148B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                br.readLine();
                br.readLine();

                sb.append(n + m).append("\n");
            }

            System.out.print(sb);
        }
}
