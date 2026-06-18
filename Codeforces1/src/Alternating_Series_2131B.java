import java.io.*;
import java.util.*;
public class Alternating_Series_2131B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                for (int i = 1; i <= n; i++) {
                    int val;

                    if ((i & 1) == 1) {
                        val = -1;
                    } else {
                        val = (i == n) ? 2 : 3;
                    }

                    if (i > 1) out.append(' ');
                    out.append(val);
                }
                out.append('\n');
            }

            System.out.print(out);
        }
}
