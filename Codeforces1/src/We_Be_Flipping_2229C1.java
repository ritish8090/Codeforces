import java.io.*;
import java.util.*;
public class We_Be_Flipping_2229C1 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder out = new StringBuilder();

            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                long[] a = new long[n];
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int i = 0; i < n; i++) {
                    a[i] = Long.parseLong(st.nextToken());
                }

                ArrayList<Integer> ops = new ArrayList<>();
                int flip = 0;

                for (int i = n - 1; i >= 0; i--) {
                    long cur = (flip == 0 ? a[i] : -a[i]);

                    if (cur > 0) {
                        ops.add(i + 1);
                        flip ^= 1;
                    }
                }

                out.append(ops.size()).append('\n');
                for (int x : ops) {
                    out.append(x).append(' ');
                }
                out.append('\n');
            }

            System.out.print(out);
        }
}
