import java.io.*;
import java.util.*;
public class Different_Distances_2233B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());

                if (n == 2) {
                    out.append("1 2 1 1 2 2 1 2\n");
                    continue;
                }

                List<Integer> ans = new ArrayList<>(4 * n);

                for (int i = 1; i <= n; i++) ans.add(i);

                for (int i = 1; i <= n; i++) ans.add(i);

                for (int i = 2; i <= n; i++) ans.add(i);
                ans.add(1);

                for (int i = 4; i <= n; i++) ans.add(i);
                for (int i = 1; i <= Math.min(3, n); i++) ans.add(i);

                for (int i = 0; i < ans.size(); i++) {
                    if (i > 0) out.append(' ');
                    out.append(ans.get(i));
                }
                out.append('\n');
            }

            System.out.print(out);
        }
}
