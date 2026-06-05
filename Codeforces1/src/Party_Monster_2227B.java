import java.io.*;
public class Party_Monster_2227B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                String s = br.readLine();

                int open = 0;
                for (char c : s.toCharArray()) {
                    if (c == '(') open++;
                }

                if (n % 2 == 0 && open * 2 == n) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }

            System.out.print(sb);
        }
}
