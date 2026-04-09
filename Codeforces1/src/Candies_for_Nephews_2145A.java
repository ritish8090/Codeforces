import java.util.*;
import java.io.*;
public class Candies_for_Nephews_2145A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                int rem = n % 3;
                sb.append(rem == 0 ? 0 : 3 - rem).append('\n');
            }

            System.out.print(sb);
        }
}
