import java.io.*;
import java.util.*;
public class Intercepted_Inputs_2037B {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int k = Integer.parseInt(br.readLine());
                int[] cnt = new int[k + 1];

                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 0; i < k; i++) {
                    cnt[Integer.parseInt(st.nextToken())]++;
                }

                int total = k - 2;

                for (int n = 1; n <= total; n++) {
                    if (total % n == 0) {
                        int m = total / n;

                        if (n <= k && m <= k && cnt[n] > 0 && cnt[m] > 0) {
                            out.append(n).append(' ').append(m).append('\n');
                            break;
                        }
                    }
                }
            }

            System.out.print(out);
        }
}
