import java.util.*;
import java.io.*;
public class Shortest_Increasing_Path_2147A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long x = Long.parseLong(st.nextToken());
                long y = Long.parseLong(st.nextToken());

                if (x < y) {
                    sb.append(2).append('\n');
                } else if (y > 1 && x > y + 1) {
                    sb.append(3).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            }

            System.out.print(sb);
        }
}
