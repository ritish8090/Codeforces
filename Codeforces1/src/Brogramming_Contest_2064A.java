import java.io.*;
public class Brogramming_Contest_2064A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                String s = br.readLine();

                int ans = s.charAt(0) == '1' ? 1 : 0;
                for (int i = 1; i < n; i++) {
                    if (s.charAt(i) != s.charAt(i - 1)) ans++;
                }

                sb.append(ans).append('\n');
            }

            System.out.print(sb);
        }
}
