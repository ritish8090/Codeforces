import java.io.*;
public class Equal_Subsequences_2118A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                String[] s = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);

                StringBuilder ans = new StringBuilder();

                for (int i = 0; i < k; i++) ans.append('1');
                for (int i = 0; i < n - k; i++) ans.append('0');

                out.append(ans).append('\n');
            }

            System.out.print(out);
        }
}
