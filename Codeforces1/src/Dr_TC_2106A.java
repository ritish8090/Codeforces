import java.util.*;
import java.io.*;
public class Dr_TC_2106A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                String s = br.readLine().trim();

                int ones = 0;
                for (char c : s.toCharArray()) if (c == '1') ones++;
                int zeros = n - ones;

                sb.append((long) ones * (n - 1) + zeros).append('\n');
            }

            System.out.print(sb);
        }
}
