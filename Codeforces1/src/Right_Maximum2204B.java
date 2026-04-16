import java.util.*;
import java.io.*;
public class Right_Maximum2204B {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(st.nextToken());
                }

                int[] prefMaxIdx = new int[n];
                int maxVal = a[0];
                int maxIdx = 0;
                prefMaxIdx[0] = 0;

                for (int i = 1; i < n; i++) {
                    if (a[i] >= maxVal) {
                        maxVal = a[i];
                        maxIdx = i;
                    }
                    prefMaxIdx[i] = maxIdx;
                }

                int count = 0;
                int end = n - 1;

                while (end >= 0) {
                    int idx = prefMaxIdx[end];
                    count++;
                    end = idx - 1;
                }

                sb.append(count).append('\n');
            }

            System.out.print(sb);
        }
}
