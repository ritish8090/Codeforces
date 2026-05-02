import java.util.*;
import java.io.*;
public class Recycling_Center_2128A {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                long c = Long.parseLong(st.nextToken());

                st = new StringTokenizer(br.readLine());
                long[] a = new long[n];
                for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());

                Arrays.sort(a);

                boolean[] used = new boolean[n];
                int free = 0;

                for (int j = 0; j < n; j++) {


                    if (a[j] > c) continue;
                    long ratio = c / a[j];
                    int maxStep = 0;
                    while (maxStep + 1 < n && (ratio >> (maxStep + 1)) >= 1) maxStep++;
                    if (maxStep >= n) maxStep = n - 1;


                    for (int i = maxStep; i >= 0; i--) {
                        if (!used[i]) {
                            used[i] = true;
                            free++;
                            break;
                        }
                    }
                }

                sb.append(n - free).append('\n');
            }

            System.out.print(sb);
        }
}
