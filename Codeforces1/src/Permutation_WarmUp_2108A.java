import java.io.*;
public class Permutation_WarmUp_2108A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                long n = Long.parseLong(br.readLine());
                sb.append(n * n / 4 + 1).append('\n');
            }

            System.out.print(sb);
        }
}
