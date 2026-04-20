import java.util.*;
import java.io.*;
public class Array_2209B {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
                for (int i = 0; i < n; i++) {
                    int less = 0, greater = 0;
                    for (int j = i + 1; j < n; j++) {
                        if (a[j] < a[i]) less++;
                        else if (a[j] > a[i]) greater++;
                    }
                    if (i > 0) sb.append(' ');
                    sb.append(Math.max(less, greater));
                }
                sb.append('\n');
            }
            System.out.print(sb);
        }
}
