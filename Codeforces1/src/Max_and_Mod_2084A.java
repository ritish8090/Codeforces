import java.io.*;
public class Max_and_Mod_2084A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                if (n % 2 == 0) {
                    out.append("-1\n");
                } else {
                    out.append(n);
                    for (int i = 1; i < n; i++) {
                        out.append(" ").append(i);
                    }
                    out.append("\n");
                }
            }

            System.out.print(out);
        }
}
