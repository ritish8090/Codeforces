import java.io.*;
public class Easy_Problem_2044A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                sb.append(n - 1).append('\n');
            }

            System.out.print(sb);
        }
}
