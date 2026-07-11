import java.io.*;
import java.util.*;
public class Bigrams_2242A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder out = new StringBuilder();

            while (t-- > 0) {
                int k = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());

                int max = 0;
                int two = 0;

                for (int i = 0; i < k; i++) {
                    int x = Integer.parseInt(st.nextToken());
                    max = Math.max(max, x);
                    if (x >= 2) two++;
                }

                if (max >= 3 || two >= 2) out.append("YES\n");
                else out.append("NO\n");
            }

            System.out.print(out);
        }
}
