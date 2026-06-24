import java.io.*;
import java.util.*;
public class A_Simple_Sequence_2210A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                for (int i = n; i >= 1; i--) {
                    out.append(i);
                    if (i > 1) out.append(' ');
                }
                out.append('\n');
            }

            System.out.print(out);
        }
}
