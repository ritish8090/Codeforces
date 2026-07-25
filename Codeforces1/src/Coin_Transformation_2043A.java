import java.io.*;
public class Coin_Transformation_2043A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                long n = Long.parseLong(br.readLine());
                long ans = 1;
                while (n >= 4) {
                    ans <<= 1;
                    n /= 4;
                }
                sb.append(ans).append('\n');
            }

            System.out.print(sb);
        }
}
