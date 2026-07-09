import java.io.*;
import java.util.*;
public class Preparing_for_the_Olympiad_2051A {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());

                int[] a = new int[n];
                int[] b = new int[n];

                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(st.nextToken());
                }

                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    b[i] = Integer.parseInt(st.nextToken());
                }

                int ans = a[n - 1];

                for (int i = 0; i < n - 1; i++) {
                    ans += Math.max(0, a[i] - b[i + 1]);
                }

                sb.append(ans).append('\n');
            }

            System.out.print(sb);
        }
}
