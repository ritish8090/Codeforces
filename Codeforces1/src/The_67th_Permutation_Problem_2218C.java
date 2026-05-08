import java.util.*;
import java.io.*;
public class The_67th_Permutation_Problem_2218C {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                int total = 3 * n;
                for (int i = 0; i < n; i++) {
                    int small = i + 1;
                    int large2 = total - 2 * i;
                    int large1 = total - 2 * i - 1;
                    sb.append(small).append(' ').append(large1).append(' ').append(large2).append(' ');
                }
                sb.append('\n');
            }

            System.out.print(sb);
        }
}
