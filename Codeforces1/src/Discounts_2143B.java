import java.util.*;
import java.io.*;
public class Discounts_2143B {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());

                int[] a = new int[n];
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

                int[] b = new int[k];
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < k; i++) b[i] = Integer.parseInt(st.nextToken());

                Arrays.sort(a);
                Arrays.sort(b);

                long total = 0;
                for (int i = 0; i < n; i++) total += a[i];

                long saved = 0;
                int i = n - 1;

                for (int j = 0; j < k && i >= 0; j++) {
                    int freeIdx = i - b[j] + 1;
                    if (freeIdx >= 0) {
                        saved += a[freeIdx];
                        i = freeIdx - 1;
                    }
                }

                sb.append(total - saved).append('\n');
            }

            System.out.print(sb);
        }
}
