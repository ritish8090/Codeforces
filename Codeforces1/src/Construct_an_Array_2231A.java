import java.io.*;
public class Construct_an_Array_2231A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                for (int i = 1; i <= n; i++) {
                    sb.append(2 * i - 1).append(" ");
                }
                sb.append('\n');
            }

            System.out.print(sb);
        }
}
