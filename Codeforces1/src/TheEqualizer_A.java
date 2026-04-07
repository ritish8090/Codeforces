import java.util.*;
import java.io.*;
public class TheEqualizer_A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());

                st = new StringTokenizer(br.readLine());
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += Integer.parseInt(st.nextToken());
                }

                boolean nkEven = (n * k) % 2 == 0;
                boolean sumOdd = sum % 2 == 1;

                boolean wins = nkEven || sumOdd;
                sb.append(wins? "YES" : "NO").append("\n");
            }
            System.out.print(sb);
        }
}
