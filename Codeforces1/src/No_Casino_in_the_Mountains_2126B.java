import java.util.*;
import java.io.*;
public class No_Casino_in_the_Mountains_2126B {
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

                int hikes = 0;
                int i = 0;
                while (i <= n - k) {
                    boolean canHike = true;
                    for (int j = i; j < i + k; j++) {
                        if (a[j] == 1) { i = j + 1; canHike = false; break; }
                    }
                    if (canHike) { hikes++; i += k + 1; }
                }

                sb.append(hikes).append('\n');
            }

            System.out.print(sb);
        }
}
